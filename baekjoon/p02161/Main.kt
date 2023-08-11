package baekjoon.p02161

fun main(args: Array<String>) {
    println(solve(readLine()!!.toInt()).joinToString(" "))
}

private fun solve(input: Int): List<Int> {
    val ret = ArrayList<Int>()
    val list = (1..input).toMutableList()

    while (true) {
        ret.add(list.removeAt(0))
        if (list.size == 0) {
            break
        }

        list.add(list.removeAt(0))
    }

    return ret
}