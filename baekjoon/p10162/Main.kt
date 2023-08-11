package baekjoon.p10162

fun main(args: Array<String>) {
    val t = readLine()!!.toInt()
    for (num in solve(t)) {
        print("$num ")
    }
}

private fun solve(input: Int): IntArray {
    val ret = IntArray(3)
    var t = input

    ret[0] = t / 300
    t %= 300

    ret[1] = t / 60
    t %= 60

    ret[2] = t / 10
    t %= 10

    return when (t) {
        0 -> ret
        else -> arrayOf(-1).toIntArray()
    }
}