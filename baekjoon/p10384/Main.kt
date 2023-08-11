package baekjoon.p10384

fun main(args: Array<String>) {
    val n = readLine()!!.toInt()
    for (i in 1..n) {
        println("Case $i: ${solve(readLine()!!)}")
    }
}

private fun solve(input: String): String {
    val cnt = IntArray(26)
    for (ch in input.toLowerCase()) {
        if (ch.isLowerCase()) {
            cnt[ch - 'a']++
        }
    }

    var min = Int.MAX_VALUE
    for (n in cnt) {
        min = minOf(min, n)
    }

    return when (min) {
        0 -> "Not a pangram"
        1 -> "Pangram!"
        2 -> "Double pangram!!"
        else -> "Triple pangram!!!"
    }
}