package baekjoon.p01978

fun main(args: Array<String>) {
    val n = readLine()!!.toInt()
    val inputs = readLine()!!.split(" ").map { it.toInt() }.toIntArray()

//    println(solve(inputs))
    println(solve2(inputs))
}

private fun solve(inputs: IntArray): Int {
    var ret = 0;

    for (input in inputs) {
        if (isPrime(input)) {
            ret++
        }
    }

    return ret
}

private fun isPrime(n: Int): Boolean {
    if (n <= 1) {
        return false
    }

    for (i in 2 until n) {
        if (n % i == 0) {
            return false
        }
    }

    return true
}

private fun solve2(inputs: IntArray): Int {
    var ret = 0
    val prime = BooleanArray(1001) { true }

    prime[0] = false
    prime[1] = false

    for (i in 2 until prime.size) {
        if (prime[i]) {
            for (j in (i * 2) until prime.size step i) {
                prime[j] = false
            }
        }
    }

    for (input in inputs) {
        if (prime[input]) {
            ret++
        }
    }

    return ret
}