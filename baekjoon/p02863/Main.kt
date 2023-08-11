package baekjoon.p02863

fun main() {
    val inputs = Array(2) { readLine()!!.split(" ").map { it.toInt() }.toIntArray() }
    println(solve(inputs))
}

private fun solve(inputs: Array<IntArray>): Int {
    val arr = DoubleArray(4)
    for (i in 0 until arr.size) {
        arr[i] = (inputs[0][0].toDouble() / inputs[1][0] + inputs[0][1].toDouble() / inputs[1][1])
        rotate(inputs)
    }

    return arr.indexOf(arr.max()!!)
}

private fun rotate(arr: Array<IntArray>) {
    val temp = arr[0][0]
    arr[0][0] = arr[1][0]
    arr[1][0] = arr[1][1]
    arr[1][1] = arr[0][1]
    arr[0][1] = temp
}