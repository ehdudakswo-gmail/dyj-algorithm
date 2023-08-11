package baekjoon.p02525

import java.util.*

fun main(args: Array<String>) {
    val sc = Scanner(System.`in`)
    val a = sc.nextInt()
    val b = sc.nextInt()
    val c = sc.nextInt()

    val totalMinute = (a * 60) + b + c
    val hour = (totalMinute / 60) % 24
    val minute = totalMinute % 60

    println("$hour $minute")
}