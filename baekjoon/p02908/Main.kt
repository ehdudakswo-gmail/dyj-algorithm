package baekjoon.p02908

fun main(args: Array<String>) {
    val inputs = readLine()!!.split(" ").map { it.toInt() }

    val ret = maxOf(
            inputs[0].toString().reversed().toInt(),
            inputs[1].toString().reversed().toInt()
    )

    println(ret)
}