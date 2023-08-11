package baekjoon.p02578

fun main(args: Array<String>) {
    val a = List(5) { readLine()!!.split(" ").map { it.toInt() }.toIntArray() }
    val b = List(5) { readLine()!!.split(" ").map { it.toInt() } }
    println(solve(a, b))
}

private fun solve(a: List<IntArray>, b: List<List<Int>>): Int {
    val check = 0
    val size = b.size

    for (i in 0 until size) {
        for (j in 0 until size) {
            check(a, b[i][j], check)
            if (bingo(a, check) >= 3) {
                return (i * size + j + 1)
            }
        }
    }

    return -1
}

private fun check(arr: List<IntArray>, target: Int, check: Int) {
    for (i in 0 until arr.size) {
        for (j in 0 until arr[i].size) {
            if (arr[i][j] == target) {
                arr[i][j] = check
            }
        }
    }
}

private fun bingo(arr: List<IntArray>, check: Int): Int {
    var ret = 0
    val size = arr.size

    for (e in arr) {
        if (e.all { it == check }) {
            ret++
        }
    }

    for (i in 0 until size) {
        val temp = IntArray(size)
        for (j in 0 until size) {
            temp[j] = arr[j][i]
        }

        if (temp.all { it == check }) {
            ret++
        }
    }

    val a = IntArray(size)
    val b = IntArray(size)

    for (i in 0 until size) {
        a[i] = arr[i][i]
    }

    for (i in 0 until size) {
        b[i] = arr[i][size - i - 1]
    }

    if (a.all { it == 0 }) ret++
    if (b.all { it == 0 }) ret++

    return ret
}