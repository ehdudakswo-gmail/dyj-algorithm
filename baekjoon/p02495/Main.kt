package baekjoon.p02495

fun main(args: Array<String>) {
    repeat(3) {
        println(solve(readLine()!!.toInt()))
    }
}

private fun solve(input: Int): Int {
    val str = input.toString()
    var max = 1
    var cnt = 1

    for (i in 0..str.lastIndex) {
        if (i == str.lastIndex || str[i] != str[i + 1]) {
            max = maxOf(max, cnt)
            cnt = 1
        } else {
            cnt++
        }
    }

    return max
}