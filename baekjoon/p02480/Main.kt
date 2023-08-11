package baekjoon.p02480

fun main(args: Array<String>) {
    val input = readLine()!!.split(" ")
    val a = input[0].toInt()
    val b = input[1].toInt()
    val c = input[2].toInt()

    println(solve(a, b, c))
}

private fun solve(a: Int, b: Int, c: Int): Int {
    val arr = arrayOfNulls<Int>(7)
    arr.fill(0)

    arr[a] = arr[a]!!.inc()
    arr[b] = arr[b]!!.inc()
    arr[c] = arr[c]!!.inc()

    var max = 1
    for (i in 1..6) {
        if (arr[i] == 3) {
            return (10000 + i * 1000)
        }

        if (arr[i] == 2) {
            return (1000 + i * 100)
        }

        if (arr[i] == 1) {
            max = i
        }
    }

    return (max * 100)
}