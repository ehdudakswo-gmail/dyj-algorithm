package baekjoon.p10409

fun main(args: Array<String>) {
    val (n, t) = readLine()!!.split(" ").map { it.toInt() }
    val inputs = readLine()!!.split(" ").map { it.toInt() }
    println(solve(t, inputs))
}

private fun solve(t: Int, inputs: List<Int>): Int {
    var sum = 0
    val size = inputs.size

    for (i in 0 until size) {
        sum += inputs[i]
        if (sum > t) {
            return i
        }
    }

    return size
}