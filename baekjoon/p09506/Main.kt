package baekjoon.p09506

fun main(args: Array<String>) {
    while (true) {
        val n = readLine()!!.toInt()
        if (n == -1) {
            break
        }

        println(solve(n))
    }
}

private fun solve(n: Int): String {
    val list = ArrayList<Int>()

    for (i in 1..(n - 1)) {
        if (n % i == 0) {
            list.add(i)
        }
    }

    return when (list.sum()) {
        n -> solve(n, list)
        else -> "$n is NOT perfect."
    }
}

private fun solve(n: Int, list: ArrayList<Int>): String {
    return buildString {
        append(n)
        append(" = ")

        for (num in list) {
            append(num)
            append(" + ")
        }

        delete(length - 3, length)
    }
}