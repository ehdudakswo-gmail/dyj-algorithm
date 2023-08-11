package baekjoon.p02703

fun main(args: Array<String>) {
    repeat(readLine()!!.toInt()) {
        println(solve(readLine()!!, readLine()!!))
    }
}

private fun solve(a: String, b: String): String {
    return a.map {
        if (it.isUpperCase()) {
            b[it - 'A']
        } else {
            it
        }
    }.joinToString("")
}