package baekjoon.p02914

import java.util.*

fun main(args: Array<String>) {
    val sc = Scanner(System.`in`)
    val a = sc.nextInt()
    val i = sc.nextInt()

    val result = a * (i - 1) + 1
    println(result)
}