package baekjoon.p04948

import kotlin.math.sqrt

const val max = 123456 * 2
val prime = BooleanArray(max + 1)

fun main(args: Array<String>) {
    prime()
    while (true) {
        val input = readLine()!!.toInt()
        if (input == 0) break
        println(solve(input))
    }
}

private fun prime() {
    prime.fill(true)
    prime[0] = false
    prime[1] = false

    for (i in 2..sqrt(max.toDouble()).toInt()) {
        if (prime[i]) {
            for (j in i * i..max step i) {
                prime[j] = false
            }
        }
    }
}

private fun solve(n: Int): Int {
    return (n + 1..n * 2).count { prime[it] }
}