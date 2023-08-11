package baekjoon.p02511

fun main(args: Array<String>) {
    val a = readLine()!!.split(" ").map { it.toInt() }
    val b = readLine()!!.split(" ").map { it.toInt() }
    println(solve(a, b).joinToString("\n"))
}

private fun solve(a: List<Int>, b: List<Int>): List<String> {
    val ret = IntArray(2)
    for (i in 0 until a.size) {
        when {
            (a[i] > b[i]) -> ret[0] += 3
            (a[i] < b[i]) -> ret[1] += 3
            else -> {
                ret[0]++
                ret[1]++
            }
        }
    }

    val ret2 = when {
        ret[0] > ret[1] -> "A"
        ret[0] < ret[1] -> "B"
        else -> last(a, b)
    }

    return listOf(
            "${ret[0]} ${ret[1]}",
            ret2
    )
}

private fun last(a: List<Int>, b: List<Int>): String {
    for (i in a.lastIndex downTo 0) {
        when {
            a[i] > b[i] -> return "A"
            a[i] < b[i] -> return "B"
        }
    }

    return "D"
}