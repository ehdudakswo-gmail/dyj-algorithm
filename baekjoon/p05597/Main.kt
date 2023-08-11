package baekjoon.p05597

fun main(args: Array<String>) {
    val inputs = IntArray(28) { readLine()!!.toInt() }
    for (output in solve(inputs)) {
        println(output)
    }
}

private fun solve(inputs: IntArray): List<Int> {
    val ret = ArrayList<Int>()
    val check = BooleanArray(31) { false }

    for (input in inputs) {
        check[input] = true
    }

    for (i in 1 until check.size) {
        if (check[i]) {
            continue
        }

        ret.add(i)
    }

    return ret
}