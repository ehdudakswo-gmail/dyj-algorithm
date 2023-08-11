package baekjoon.p11094

fun main(args: Array<String>) {
    val n = readLine()!!.toInt()
    val inputs = List(n) { readLine()!! }
    println(solve(inputs).joinToString("\n"))
}

private fun solve(inputs: List<String>): List<String> {
    val ret = ArrayList<String>()
    val target = "Simon says"

    for (e in inputs) {
        if (e.contains(target)) {
            ret.add(e.replace(target, ""))
        }
    }

    return ret
}