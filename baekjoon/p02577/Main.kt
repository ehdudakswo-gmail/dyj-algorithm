package baekjoon.p02577

fun main(args: Array<String>) {
    val a = readLine()!!.toInt()
    val b = readLine()!!.toInt()
    val c = readLine()!!.toInt()

    for (solve in solve(a, b, c)) {
        println(solve)
    }
}

private fun solve(a: Int, b: Int, c: Int): IntArray {
    val ret = IntArray(10)
    var mul = (a * b * c)

    while (mul != 0) {
        ret[mul % 10]++
        mul /= 10
    }

    return ret
}