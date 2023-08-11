package baekjoon.p09625

fun main(args: Array<String>) {
    println(solve(readLine()!!.toInt()).joinToString(" "))
}

private fun solve(k: Int): Array<Int> {
    var a = 1
    var b = 0

    repeat(k) {
        val aa = b
        val bb = a + b
        a = aa
        b = bb
    }

    return arrayOf(a, b)
}