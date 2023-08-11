package baekjoon.p01547

fun main(args: Array<String>) {
    val m = readLine()!!.toInt()
    val inputs = List(m) { readLine()!!.split(" ").map { it.toInt() } }
    println(solve(inputs))
}

private fun solve(inputs: List<List<Int>>): Int {
    val pos = arrayOf(0, 1, 2, 3)

    for (input in inputs) {
        swap(pos, input[0], input[1])
    }

    return pos.indexOf(1)
}

private fun swap(arr: Array<Int>, a: Int, b: Int) {
    val temp = arr[a]
    arr[a] = arr[b]
    arr[b] = temp
}