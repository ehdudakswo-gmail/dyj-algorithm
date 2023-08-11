package baekjoon.p10178

fun main(args: Array<String>) {
    repeat(readLine()!!.toInt()) {
        val inputs = readLine()!!.split(" ").map { it2 -> it2.toInt() }
        val ret = "You get ${inputs[0] / inputs[1]} piece(s) and your dad gets ${inputs[0] % inputs[1]} piece(s)."
        println(ret)
    }
}