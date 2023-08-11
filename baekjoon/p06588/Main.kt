package baekjoon.p06588

import kotlin.math.sqrt

val prime = BooleanArray(1000001)

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

    val sqrt = sqrt(prime.lastIndex.toFloat()).toInt()
    for (i in 2 until sqrt) {
        if (prime[i]) {
            for (j in i * i until prime.size step i) {
                prime[j] = false
            }
        }
    }
}

private fun solve(n: Int): String {
    for (i in 3..(n / 2)) {
        if (prime[i] && prime[n - i]) {
            return "$n = $i + ${n - i}"
        }
    }

    return "Goldbach's conjecture is wrong."
}