package baekjoon.p01940

fun main(args: Array<String>) {
    val n = readLine()!!.toInt()
    val m = readLine()!!.toInt()
    val inputs = readLine()!!.split(" ").map { it.toInt() }
    println(solve(inputs, m))
}

private fun solve(inputs: List<Int>, m: Int): Int {
    val check = BooleanArray(1000001)
    for (input in inputs) {
        check[input] = true
    }

    var ret = 0
    var left = 0
    var right = m

    while (left < right) {
        if (check[left] && check[right]) {
            ret++
        }

        left++
        right--
    }

    return ret
}