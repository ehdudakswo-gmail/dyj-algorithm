package baekjoon.p06603

fun main() {
    while (true) {
        val inputs = readLine()!!.split(" ").map { it.toInt() }
        if (inputs[0] == 0) {
            break
        }

        val arr = inputs.filterIndexed { index, i -> index > 0 }
        for (solve in solve(arr)) {
            println(solve.joinToString(" "))
        }
        println()
    }
}

private fun solve(arr: List<Int>): List<List<Int>> {
    return Combination(arr, 6).get()
}

private class Combination(val arr: List<Int>, val r: Int) {

    val ret = ArrayList<List<Int>>()
    val n = arr.size

    fun get(): List<List<Int>> {
        dfs(ArrayList(), 0)
        return ret
    }

    private fun dfs(list: List<Int>, start: Int) {
        if (list.size == r) {
            ret.add(list)
            return
        }

        for (i in start until n) {
            val copy = ArrayList(list)
            copy.add(arr[i])
            dfs(copy, i + 1)
        }
    }

}