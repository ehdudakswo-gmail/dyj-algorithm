package baekjoon.p10886

fun main(args: Array<String>) {
    var cnt = 0

    repeat(readLine()!!.toInt()) {
        when (readLine()!!.toInt()) {
            0 -> cnt--
            1 -> cnt++
        }
    }

    println(when {
        cnt > 0 -> "Junhee is cute!"
        else -> "Junhee is not cute!"
    })
}