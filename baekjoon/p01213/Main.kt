package baekjoon.p01213

fun main() {
    println(solve(readLine()!!))
}

private fun solve(input: String): String {
    val cnt = IntArray(26)
    for (ch in input) {
        val idx = (ch - 'A')
        cnt[idx]++
    }

    val half = ArrayList<Char>()
    for (i in 0 until cnt.size) {
        val n = cnt[i] / 2
        val ch = (i + 'A'.toInt()).toChar()
        repeat(n) {
            half.add(ch)
        }
    }

    val center = ArrayList<Char>()
    for (i in 0 until cnt.size) {
        if (cnt[i] % 2 == 1) {
            val ch = (i + 'A'.toInt()).toChar()
            center.add(ch)
        }
    }

    val reverse = half.reversed()
    val list = ArrayList<Char>()
    list.addAll(half)
    list.addAll(center)
    list.addAll(reverse)

    val str = list.joinToString("")
    val rev = str.reversed()

    return when (str == rev) {
        true -> str
        false -> "I'm Sorry Hansoo"
    }
}