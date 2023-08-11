package baekjoon.p02530

import java.util.*

fun main(agrs: Array<String>) {
    val sc = Scanner(System.`in`)
    val a = sc.nextInt()
    val b = sc.nextInt()
    val c = sc.nextInt()
    val d = sc.nextInt()

    val totalSecond = (a * 3600) + (b * 60) + c + d
    val hour = (totalSecond / 3600) % 24
    val minute = (totalSecond / 60) % 60
    val second = totalSecond % 60

    println("$hour $minute $second")
}