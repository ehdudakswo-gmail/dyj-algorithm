package baekjoon.p10804

fun main(args: Array<String>) {
    val inputs = List(10) { readLine()!!.split(" ").map { it.toInt() } }
    println(solve(inputs).joinToString(" "))
}

private fun solve(inputs: List<List<Int>>): Array<Int> {
    val ret = Array(20) { it + 1 }
    for (input in inputs) {
        reverse(ret, input[0] - 1, input[1] - 1)
    }

    return ret
}

private fun reverse(arr: Array<Int>, a: Int, b: Int) {
    var i = a
    var j = b

    while (i <= j) {
        val temp = arr[i]
        arr[i] = arr[j]
        arr[j] = temp
        i++
        j--
    }
}