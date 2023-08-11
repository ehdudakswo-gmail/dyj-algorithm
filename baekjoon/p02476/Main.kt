package baekjoon.p02476

fun main(args: Array<String>) {
    var ret = 0

    repeat(readLine()!!.toInt()) {
        val (x, y, z) = readLine()!!.split(" ").map { it2 -> it2.toInt() }
        ret = maxOf(ret, solve(x, y, z))
    }

    println(ret)
}

private fun solve(vararg input: Int): Int {
    val arr = Array(7) { 0 }
    arr[input[0]]++
    arr[input[1]]++
    arr[input[2]]++

    var max = 0
    for (i in 1 until arr.size) {
        if (arr[i] == 3) {
            return 10000 + (i * 1000)
        }

        if (arr[i] == 2) {
            return 1000 + (i * 100)
        }

        max = i
    }

    return (max * 100)
}