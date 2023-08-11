package baekjoon.p05565

fun main(args: Array<String>) {
    val inputs = IntArray(10)

    for (i in 0 until inputs.size) {
        inputs[i] = readLine()!!.toInt()
    }

    println(solve(inputs))
}

private fun solve(inputs: IntArray): Int {
    val total = inputs[0]
    var sum = 0

    for (i in 1 until inputs.size) {
        sum += inputs[i]
    }

    return (total - sum)
}