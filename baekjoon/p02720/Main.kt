package baekjoon.p02720

fun main(args: Array<String>) {
    repeat(readLine()!!.toInt()) {
        println(solve(readLine()!!.toInt()).joinToString(" "))
    }
}

private fun solve(input: Int): Array<Int> {
    var n = input
    val sets = arrayOf(25, 10, 5, 1)
    val ret = Array(sets.size) { 0 }

    for (i in 0 until ret.size) {
        ret[i] = (n / sets[i])
        n %= sets[i]
    }

    return ret
}