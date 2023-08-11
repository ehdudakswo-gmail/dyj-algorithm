package baekjoon.p03460

fun main(args: Array<String>) {
    repeat(readLine()!!.toInt()) {
        for (solve in solve(readLine()!!.toInt())) {
            print("$solve ")
        }
        println()
    }
}

private fun solve(n: Int): ArrayList<Int> {
    val ret = ArrayList<Int>()
    val revBinary = n.toString(2).reversed()

    for (i in 0 until revBinary.length) {
        if (revBinary[i] == '1') {
            ret.add(i)
        }
    }

    return ret
}