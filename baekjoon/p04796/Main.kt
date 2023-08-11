package baekjoon.p04796

fun main() {
    var i = 1
    while (true) {
        val inputs = readLine()!!.split(" ").map { it.toInt() }
        if (inputs.all { it == 0 }) {
            break
        }

        val solve = solve(inputs[0], inputs[1], inputs[2])
        println("Case ${i++}: $solve")
    }
}

private fun solve(l: Int, p: Int, v: Int): Int {
    var ret = 0

    ret += (v / p) * l
    ret += minOf(v % p, l)

    return ret
}