package baekjoon.p01292

fun main(args: Array<String>) {
    val inputs = readLine()!!.split(" ").map { it.toInt() }
    println(solve(inputs[0], inputs[1]))
}

private fun solve(a: Int, b: Int): Int {
    val list = list()
    return (a..b).sumBy { list[it - 1] }
}

private fun list(): IntArray {
    val max = 1000
    val list = ArrayList<Int>()

    for (i in 1..max) {
        repeat(i) {
            list.add(i)
        }

        if (list.size > max) {
            break
        }
    }

    return list.toIntArray()
}