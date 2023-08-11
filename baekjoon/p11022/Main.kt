package baekjoon.p11022

import java.util.*

fun main(args: Array<String>) {
    val sc = Scanner(System.`in`)
    val t = sc.nextInt()

    for (i in 1..t) {
        val a = sc.nextInt()
        val b = sc.nextInt()
        val sum = a + b
        val result = "Case #$i: $a + $b = $sum"
        println(result)
    }

}