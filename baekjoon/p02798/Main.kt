package baekjoon.p02798

fun main(args: Array<String>) {
    val (n, m) = readLine()!!.split(" ").map { it.toInt() }
    val inputs = readLine()!!.split(" ").map { it.toInt() }
    println(solve(inputs, m))
}

private fun solve(inputs: List<Int>, m: Int): Int {
    val size = inputs.size
    var ret = 0

    for (i in 0 until size) {
        for (j in i + 1 until size) {
            for (k in j + 1 until size) {
                val sum = inputs[i] + inputs[j] + inputs[k]
                if (sum <= m) {
                    ret = maxOf(ret, sum)
                }
            }
        }
    }

    return ret
}