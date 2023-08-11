package baekjoon.p10448

private val list = ArrayList<Int>()

fun main(args: Array<String>) {
    list()
    repeat(readLine()!!.toInt()) {
        println(solve(readLine()!!.toInt()))
    }
}

private fun list() {
    var n = 1
    while (true) {
        val nn = n * (n + 1) / 2
        if (nn > 1000) {
            break
        }

        list.add(nn)
        n++
    }
}

private fun solve(k: Int): Int {
    for (a in 0 until list.size) {
        for (b in 0 until list.size) {
            for (c in 0 until list.size) {
                if (list[a] + list[b] + list[c] == k) {
                    return 1
                }
            }
        }
    }

    return 0
}