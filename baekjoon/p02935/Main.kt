package baekjoon.p02935

fun main(args: Array<String>) {
    val a = readLine().toString()
    val oper = readLine().toString()
    val b = readLine().toString()

    println(solve(a, oper, b))
}

private fun solve(a: String, oper: String, b: String): String {
    when (oper) {
        "+" -> return a.toBigInteger().plus(b.toBigInteger()).toString()
        "*" -> return a.toBigInteger().multiply(b.toBigInteger()).toString()
    }

    return ""
}