package baekjoon.p10972

fun main(args: Array<String>) {
    val n = readLine()!!.toInt()
    val inputs = readLine()!!.split(" ").map { it.toInt() }
    println(solve(inputs).joinToString(" "))
}

private fun solve(inputs: List<Int>): IntArray {
    val ret = inputs.toIntArray()
    val cut = (ret.lastIndex - 1 downTo 0).find { ret[it] < ret[it + 1] } ?: return intArrayOf(-1)
    val min = (ret.lastIndex downTo cut + 1).find { ret[it] > ret[cut] }!!

    swap(ret, cut, min)
    ret.sort(cut + 1)

    return ret
}

private fun swap(arr: IntArray, a: Int, b: Int) {
    val temp = arr[a]
    arr[a] = arr[b]
    arr[b] = temp
}