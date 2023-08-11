package baekjoon.p05355

fun main(args: Array<String>) {
    repeat(readLine()!!.toInt()) {
        val input = readLine().toString()
        val result = solve(input)
        println(result)
    }
}

private fun solve(input: String): String {
    val arr = input.split(" ")
    var num = arr[0].toDouble()

    for (value in arr.drop(1)) {
        when (value) {
            "@" -> num *= 3
            "%" -> num += 5
            "#" -> num -= 7
        }
    }

    return "%.2f".format(num)
}