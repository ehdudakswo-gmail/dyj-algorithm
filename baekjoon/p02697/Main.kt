package baekjoon.p02697

fun main(args: Array<String>) {
    repeat(readLine()!!.toInt()) {
        println(solve(readLine()!!))
    }
}

private fun solve(input: String): String {
    val arr = input.toCharArray()
    val idx = (arr.lastIndex - 1 downTo 0).find { arr[it] < arr[it + 1] } ?: return "BIGGEST"
    val min = (arr.lastIndex downTo idx + 1).find { arr[it] > arr[idx] }!!

    swap(arr, idx, min)
    arr.sort(idx + 1)

    return arr.joinToString("")
}

private fun swap(arr: CharArray, a: Int, b: Int) {
    val temp = arr[a]
    arr[a] = arr[b]
    arr[b] = temp
}