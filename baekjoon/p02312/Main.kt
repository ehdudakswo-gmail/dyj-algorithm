package baekjoon.p02312

fun main() {
    repeat(readLine()!!.toInt()) {
        for (solve in solve(readLine()!!.toInt())) {
            println("${solve[0]} ${solve[1]}")
        }
    }
}

private fun solve(n: Int): List<IntArray> {
    val ret = ArrayList<IntArray>()
    var x = n

    for (i in 2..x) {
        var cnt = 0
        while (x % i == 0) {
            x /= i
            cnt++
        }

        if (cnt != 0) {
            val arr = IntArray(2)
            arr[0] = i
            arr[1] = cnt
            ret.add(arr)
        }
    }

    return ret
}