package baekjoon.p10809

fun main(args: Array<String>) {
    val input = readLine()!!
    println(solve(input).joinToString(" "))
}

private fun solve(input: String): IntArray {
    val ret = IntArray(26) { -1 }

    for (i in 0 until input.length) {
        val ch = input[i]
        val idx = ch - 'a'

        if (ret[idx] == -1) {
            ret[idx] = i
        }
    }

    return ret
}