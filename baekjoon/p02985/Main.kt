package baekjoon.p02985

fun main(args: Array<String>) {
    val (a, b, c) = readLine()!!.split(" ").map { it.toInt() }
    println(solve(a, b, c))
}

private fun solve(a: Int, b: Int, c: Int): String {
    val oper = oper(a, b, c)
    val oper2 = oper(b, c, a)

    return when {
        oper.isNotEmpty() -> "$a$oper$b=$c"
        oper2.isNotEmpty() -> "$a=$b$oper2$c"
        else -> ""
    }
}

private fun oper(a: Int, b: Int, c: Int): String {
    return when (c) {
        a + b -> "+"
        a - b -> "-"
        a * b -> "*"
        a / b -> "/"
        else -> ""
    }
}