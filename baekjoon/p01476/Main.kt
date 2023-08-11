package baekjoon.p01476

fun main(args: Array<String>) {
    val inputs = readLine()!!.split(" ").map { it.toInt() }
    println(solve(inputs))
}

private fun solve(inputs: List<Int>): Int {
    var ret = 1
    val inputArr = inputs.toIntArray()
    val list = IntArray(3) { 1 }
    val set = intArrayOf(15, 28, 19)

    while (!inputArr.contentEquals(list)) {
        for (i in 0 until list.size) {
            list[i]++
            if (list[i] > set[i]) {
                list[i] = 1
            }
        }

        ret++
    }

    return ret
}