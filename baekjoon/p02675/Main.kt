package baekjoon.p02675

fun main(args: Array<String>) {
    repeat(readLine()!!.toInt()) {
        val input = readLine().toString()
        val inputs = input.split(" ")

        val r = inputs[0].toInt()
        val s = inputs[1]
        println(solve(r, s))
    }
}

private fun solve(r: Int, s: String): String {
    val sb = StringBuilder()

    for (ch in s.drop(0)) {
        repeat(r) {
            sb.append(ch)
        }
    }

    return sb.toString()
}