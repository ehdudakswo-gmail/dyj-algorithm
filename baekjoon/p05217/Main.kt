package baekjoon.p05217

fun main(args: Array<String>) {
    repeat(readLine()!!.toInt()) {
        val n = readLine()!!.toInt()
        println("Pairs for $n: ${solve(n)}")
    }
}

private fun solve(n: Int): String {
    val list = ArrayList<Array<Int>>()
    for (i in 1 until n) {
        val j = n - i
        if (i >= j) {
            break
        }

        list.add(arrayOf(i, j))
    }

    return list.map { "${it[0]} ${it[1]}" }.joinToString(", ")
}