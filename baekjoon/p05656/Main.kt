package baekjoon.p05656

fun main(args: Array<String>) {
    var i = 1

    while (true) {
        val inputs = readLine()!!.split(" ")
        if (inputs[1] == "E") {
            break
        } else {
            val solve = solve(inputs[1], inputs[0].toInt(), inputs[2].toInt())
            println("Case ${i++}: $solve")
        }
    }
}

private fun solve(oper: String, a: Int, b: Int): Boolean {
    return when (oper) {
        ">" -> a > b
        ">=" -> a >= b
        "<" -> a < b
        "<=" -> a <= b
        "==" -> a == b
        "!=" -> a != b
        else -> false
    }
}