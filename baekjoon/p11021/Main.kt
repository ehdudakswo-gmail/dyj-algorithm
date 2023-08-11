package baekjoon.p11021

import java.util.*

fun main(args: Array<String>) {
    val sc = Scanner(System.`in`)
    val t = sc.nextInt()

    for (i in 1..t) {
        val a = sc.nextInt()
        val b = sc.nextInt()
        val result = (a + b)
        println("Case #$i: $result")
    }
}