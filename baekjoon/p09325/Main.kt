package baekjoon.p09325

fun main(args: Array<String>) {
    repeat(readLine()!!.toInt()) {
        val s = readLine()!!.toInt()
        val n = readLine()!!.toInt()
        val inputs = Array(n) { IntArray(2) }

        for (input in inputs) {
            val arr = readLine()!!.split(" ").map { it2 -> it2.toInt() }
            input[0] = arr[0]
            input[1] = arr[1]
        }

        println(solve(s, inputs))
    }
}

private fun solve(s: Int, inputs: Array<IntArray>): Int {
    var ret = s

    for (input in inputs) {
        ret += (input[0] * input[1])
    }

    return ret
}