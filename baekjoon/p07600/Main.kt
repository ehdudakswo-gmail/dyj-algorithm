package baekjoon.p07600

fun main(args: Array<String>) {
    while (true) {
        val input = readLine()!!
        if (input == "#") break
        println(solve(input))
    }
}

private fun solve(input: String): Int {
    val cnt = IntArray(26)
    for (ch in input.toLowerCase()) {
        if (ch.isLowerCase()) {
            cnt[ch - 'a']++
        }
    }

    var ret = 0
    for (n in cnt) {
        if (n > 0) {
            ret++
        }
    }

    return ret
}