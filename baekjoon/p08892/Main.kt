package baekjoon.p08892

fun main() {
    val t = readLine()!!.toInt()
    repeat(t) {
        val k = readLine()!!.toInt()
        val inputs = List(k) { readLine()!! }
        println(solve(inputs))
    }
}

private fun solve(inputs: List<String>): String {
    val size = inputs.size
    for (i in 0 until size) {
        for (j in 0 until size) {
            if (i == j) {
                continue
            }


            val str = inputs[i] + inputs[j]
            if (check(str)) {
                return str
            }
        }
    }

    return "0"
}

private fun check(str: String): Boolean {
    return str == str.reversed()
}