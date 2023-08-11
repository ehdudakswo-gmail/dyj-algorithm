package baekjoon.p01408

fun main(args: Array<String>) {
    val n = 2
    val inputs = ArrayList<Int>(n)

    repeat(n) {
        val arr = readLine()!!.split(":")
        var input = 0

        input += (arr[0].toInt() * 3600)
        input += (arr[1].toInt() * 60)
        input += (arr[2].toInt())

        inputs.add(input)
    }

    println(solve(inputs))
}

private fun solve(inputs: ArrayList<Int>): String {
    var diff = inputs[1] - inputs[0]

    if (diff < 0) {
        diff += (24 * 3600)
    }

    return "%02d:%02d:%02d".format(
            (diff / 3600),
            (diff % 3600) / 60,
            (diff % 3600) % 60
    )
}