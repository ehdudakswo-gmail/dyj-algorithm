package baekjoon.p01159

fun main(args: Array<String>) {
    val n = readLine()!!.toInt()
    val inputs = Array(n) { readLine()!! }
    val solves = solve(inputs)

    if (solves.isEmpty()) {
        println("PREDAJA")
    } else {
        println(solves.joinToString(""))
    }
}

private fun solve(inputs: Array<String>): List<Char> {
    val cnt = ('a'..'z').map { inputs.count { input -> (input.first() == it) } }
    val ret = ArrayList<Char>()

    for (i in 0 until cnt.size) {
        if (cnt[i] >= 5) {
            val ch = (i + 'a'.toInt()).toChar()
            ret.add(ch)
        }
    }

    return ret
}