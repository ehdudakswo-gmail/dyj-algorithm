package baekjoon.p02526

fun main() {
    val (n, p) = readLine()!!.split(" ").map { it.toInt() }
    println(solve(n, p))
}

private fun solve(n: Int, p: Int): Int {
    val list = ArrayList<Int>()
    var x = n

    while (true) {
        x = (x * n % p)
        val idx = list.indexOf(x)
        if (idx != -1) {
            return (list.size - idx)
        }
        list.add(x)
    }
}