package baekjoon.p11507

fun main() {
    println(solve(readLine()!!))
}

private fun solve(input: String): String {
    val size = input.length / 3
    val inputs = (0 until size).map {
        val idx = it * 3
        input.substring(idx, idx + 3)
    }

    val n = 26
    val m = 13
    val check = List(n) { IntArray(m + 1) }
    for (e in inputs) {
        val a = e[0] - 'A'
        val b = e.substring(1).toInt()
        if (check[a][b] != 0) {
            return "GRESKA"
        }
        check[a][b] = 1
    }

    val str = "PKHT"
    val list = ArrayList<Int>()
    for (e in str) {
        val idx = e - 'A'
        list.add(m - check[idx].sum())
    }

    return list.joinToString(" ")
}