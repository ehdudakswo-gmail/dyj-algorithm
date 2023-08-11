package baekjoon.p04435

fun main(args: Array<String>) {
    val t = readLine()!!.toInt()
    for (i in 1..t) {
        val inputs = List(2) { readLine()!!.split(" ").map { it.toInt() } }
        println("Battle $i: ${solve(inputs)}")
    }
}

private fun solve(inputs: List<List<Int>>): String {
    val a = arrayOf(1, 2, 3, 3, 4, 10)
    val b = arrayOf(1, 2, 2, 2, 3, 5, 10)

    val aa = (0 until a.size).sumBy { a[it] * inputs[0][it] }
    val bb = (0 until b.size).sumBy { b[it] * inputs[1][it] }

    return when {
        aa > bb -> "Good triumphs over Evil"
        aa < bb -> "Evil eradicates all trace of Good"
        else -> "No victor on this battle field"
    }
}