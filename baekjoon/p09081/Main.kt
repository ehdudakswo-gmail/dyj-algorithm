package baekjoon.p09081

fun main(args: Array<String>) {
    repeat(readLine()!!.toInt()) {
        println(solve(readLine()!!))
    }
}

private fun solve(input: String): String {
    val arr = input.toCharArray()
    val cut = (arr.lastIndex - 1 downTo 0).find { arr[it] < arr[it + 1] } ?: return input
    val min = (arr.lastIndex downTo cut + 1).find { arr[it] > arr[cut] }!!

    swap(arr, cut, min)
    arr.sort(cut + 1)

    return arr.joinToString("")
}

private fun swap(arr: CharArray, a: Int, b: Int) {
    val aa = arr[a]
    val bb = arr[b]
    arr[a] = bb
    arr[b] = aa
}