package baekjoon.p01373

fun main(args: Array<String>) {
    println(solve(readLine()!!))
}

private fun solve(input: String): String {
    val repeat = (3 - input.length % 3) % 3
    val binary3 = "0".repeat(repeat).plus(input)

    return buildString {
        for (i in 0 until binary3.length step 3) {
            append(binary3.substring(i, i + 3).toInt(2).toString(8))
        }
    }
}