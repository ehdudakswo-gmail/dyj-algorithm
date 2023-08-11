package baekjoon.p04592

fun main(args: Array<String>) {
    while (true) {
        var inputs = readLine()!!.split(" ").map { it.toInt() }
        if (inputs[0] == 0) {
            break
        }

        inputs = inputs.filterIndexed { index, i -> index > 0 }
        println(solve(inputs).joinToString(" ").plus(" $"))
    }
}

private fun solve(inputs: List<Int>): List<Int> {
    val ret = ArrayList<Int>()
    var selected = -1

    for (input in inputs) {
        if (input != selected) {
            selected = input
            ret.add(input)
        }
    }

    return ret
}