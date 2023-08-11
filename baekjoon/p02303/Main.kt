package baekjoon.p02303

fun main() {
    val n = readLine()!!.toInt()
    val inputs = List(n) { readLine()!!.split(" ").map { it.toInt() } }
    println(solve(inputs))
}

private fun solve(inputs: List<List<Int>>): Int {
    val arr = IntArray(inputs.size)
    for (i in 0 until arr.size) {
        arr[i] = max(inputs[i])
    }

    val max = arr.max()
    for (i in arr.lastIndex downTo 0) {
        if (arr[i] == max) {
            return (i + 1)
        }
    }

    return -1
}

private fun max(list: List<Int>): Int {
    var ret = 0
    val size = list.size

    for (i in 0 until size) {
        for (j in i + 1 until size) {
            for (k in j + 1 until size) {
                val mod = (list[i] + list[j] + list[k]) % 10
                ret = maxOf(ret, mod)
            }
        }
    }

    return ret
}