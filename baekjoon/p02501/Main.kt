package baekjoon.p02501

fun main(args: Array<String>) {
    val (n, k) = readLine()!!.split(" ").map { it.toInt() }
    val ret = (1..n).filter { n % it == 0 }.getOrElse(k - 1) { 0 }
    println(ret)
}