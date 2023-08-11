package baekjoon.p11800

fun main(args: Array<String>) {
    val t = readLine()!!.toInt()
    for (i in 1..t) {
        val inputs = readLine()!!.split(" ").map { it.toInt() }
        val solves = solve(inputs[0], inputs[1])
        println("Case $i: ${solves[0]} ${solves[1]}")
    }
}

private fun solve(a: Int, b: Int): Array<String> {
    val diff = arrayOf("", "Yakk", "Doh", "Seh", "Ghar", "Bang", "Sheesh")
    val same = arrayOf("", "Habb Yakk", "Dobara", "Dousa", "Dorgy", "Dabash", "Dosh")
    val arr = arrayOf(a, b).sortedArrayDescending()

    return when {
        (arr[0] == arr[1]) -> arrayOf(same[arr[0]], "")
        (arr[0] == 6 && arr[1] == 5) -> arrayOf("Sheesh", "Beesh")
        else -> arrayOf(diff[arr[0]], diff[arr[1]])
    }
}