package baekjoon.p02851

fun main() {
    val inputs = List(10) { readLine()!!.toInt() }
    println(solve(inputs))
}

private fun solve(inputs: List<Int>): Int {
    val n = inputs.size
    val sum = IntArray(n + 1)

    for (i in 1..n) {
        sum[i] = sum[i - 1] + inputs[i - 1]
    }

    val target = 100
    for (i in 1..n) {
        if (sum[i] >= target) {
            val pre = sum[i - 1]
            val current = sum[i]

            return when (target - pre < current - target) {
                true -> pre
                false -> current
            }
        }
    }

    return sum[n]
}