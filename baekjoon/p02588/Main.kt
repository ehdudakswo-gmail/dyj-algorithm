package baekjoon.p02588

import java.util.*

fun main(args: Array<String>) {
    val sc = Scanner(System.`in`)
    val a = sc.nextInt()
    val b = sc.nextInt()

    println(a * (b % 10))
    println(a * (b / 10 % 10))
    println(a * (b / 100 % 10))
    println(a * b)
}