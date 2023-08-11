package baekjoon.p06996

fun main() {
    repeat(readLine()!!.toInt()) {
        val inputs = readLine()!!.split(" ")
        println(solve(inputs[0], inputs[1]))
    }
}

private fun solve(a: String, b: String): String {
    val size = 26
    val cntA = IntArray(size)
    val cntB = IntArray(size)

    for (i in 0 until a.length) {
        val idx = a[i] - 'a'
        cntA[idx]++
    }

    for (i in 0 until b.length) {
        val idx = b[i] - 'a'
        cntB[idx]++
    }

    for (i in 0 until size) {
        if (cntA[i] != cntB[i]) {
            return "$a & $b are NOT anagrams."
        }
    }

    return "$a & $b are anagrams."
}