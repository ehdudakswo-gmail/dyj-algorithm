package baekjoon.p11286

import java.util.*
import kotlin.collections.ArrayList
import kotlin.math.absoluteValue

fun main(args: Array<String>) {
    val n = readLine()!!.toInt()
    val inputs = List(n) { readLine()!!.toInt() }
    println(solve(inputs).joinToString("\n"))
}

private fun solve(inputs: List<Int>): List<Int> {
    val pq = PriorityQueue<Int>(compareBy({ it.absoluteValue }, { it }))
    val ret = ArrayList<Int>()

    for (e in inputs) {
        if (e == 0) {
            if (pq.isEmpty()) {
                ret.add(0)
            } else {
                ret.add(pq.poll())
            }
        } else {
            pq.add(e)
        }
    }

    return ret
}