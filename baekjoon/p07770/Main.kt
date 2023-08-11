package baekjoon.p07770

fun main() {
    val n = readLine()!!.toInt()
    println(solve(n))
}

private fun solve(n: Int): Int {
    var height = 0
    var block = 1
    var under = 1
    var add = 4

    while (block <= n) {
        height++
        under += add
        add += 4
        block += under
    }

    return height;
}