package baekjoon.p10974

fun main(args: Array<String>) {
    val n = readLine()!!.toInt()
    val inputs = (1..n).toList()

    for (solve in P10974(inputs).solve()) {
        println(solve.joinToString(" "))
    }
}

private class P10974(inputs: List<Int>) {

    val arr = inputs
    val ret = ArrayList<List<Int>>()
    val used = BooleanArray(arr.size)

    fun solve(): List<List<Int>> {
        run(ArrayList())
        return ret
    }

    private fun run(list: List<Int>) {
        if (list.size >= arr.size) {
            ret.add(list)
            return
        }

        for (i in 0 until arr.size) {
            if (!used[i]) {
                used[i] = true
                val newList = ArrayList<Int>(list)
                newList.add(arr[i])
                run(newList)
                used[i] = false
            }
        }
    }

}