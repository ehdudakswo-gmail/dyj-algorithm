package baekjoon.p09946

fun main(args: Array<String>) {
    var i = 1
    while (true) {
        val a = readLine()!!
        val b = readLine()!!

        if (a == "END") {
            break
        }

        println("Case ${i++}: ${solve(a, b)}")
    }
}

private fun solve(a: String, b: String): String {
    val cntA = ('a'..'z').map { a.count { ch -> ch == it } }
    val cntB = ('a'..'z').map { b.count { ch -> ch == it } }

    return when (cntA == cntB) {
        true -> "same"
        false -> "different"
    }
}