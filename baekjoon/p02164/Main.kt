package baekjoon.p02164

import java.util.*

fun main(args: Array<String>) {
    println(solve(readLine()!!.toInt()))
}

private fun solve(input: Int): Int {
    val list = LinkedList<Int>((1..input).toList())

    while (list.size > 1) {
        list.removeAt(0)
        list.add(list.removeAt(0))
    }

    return list.first()
}