package baekjoon.p07568

fun main(args: Array<String>) {
    val n = readLine()!!.toInt()
    val inputs = Array(n) { readLine()!!.split(" ").map { it.toInt() } }
    println(solve(inputs).joinToString(" "))
}

private fun solve(inputs: Array<List<Int>>): IntArray {
    val lastIdx = inputs.lastIndex
    val ret = IntArray(inputs.size) { 1 }

    for (i in 0..lastIdx) {
        for (j in 0..lastIdx) {
            if (inputs[i][0] > inputs[j][0] && inputs[i][1] > inputs[j][1]) {
                ret[j]++
            }
        }
    }

    return ret
}