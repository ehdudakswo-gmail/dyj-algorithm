package baekjoon.p10973

fun main(args: Array<String>) {
    val n = readLine()!!.toInt()
    val inputs = readLine()!!.split(" ").map { it.toInt() }
    println(solve(inputs).joinToString(" "))
}

private fun solve(inputs: List<Int>): IntArray {
    val ret = inputs.toIntArray()
    val cut = (ret.lastIndex - 1 downTo 0).find { ret[it] > ret[it + 1] } ?: return intArrayOf(-1)
    val max = (ret.lastIndex downTo cut + 1).find { ret[it] < ret[cut] }!!

    swap(ret, cut, max)
    descending(ret, cut + 1, ret.lastIndex)

    return ret
}

private fun swap(arr: IntArray, a: Int, b: Int) {
    val temp = arr[a]
    arr[a] = arr[b]
    arr[b] = temp
}

private fun descending(arr: IntArray, a: Int, b: Int) {
    arr.sort(a, b + 1)
    reverse(arr, a, b)
}

private fun reverse(arr: IntArray, a: Int, b: Int) {
    var aa = a
    var bb = b

    while (aa <= bb) {
        swap(arr, aa, bb)
        aa++
        bb--
    }
}