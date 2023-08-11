package baekjoon.p03449

fun main(args: Array<String>) {
    repeat(readLine()!!.toInt()) {
        val solve = solve(readLine()!!, readLine()!!)
        println("Hamming distance is $solve.")
    }
}

private fun solve(a: String, b: String): Int {
    return (0..a.lastIndex).count { a[it] != b[it] }
}