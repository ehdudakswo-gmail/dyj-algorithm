package baekjoon.p02153

fun main(args: Array<String>) {
    println(solve(readLine()!!))
}

private fun solve(input: String): String {
    val sum = input.sumBy {
        if (it.isLowerCase()) {
            it - 'a' + 1
        } else {
            it - 'A' + 27
        }
    }

    return when (prime(sum)) {
        true -> "It is a prime word."
        false -> "It is not a prime word."
    }
}

private fun prime(n: Int): Boolean {
    for (i in 2 until n) {
        if (n % i == 0) {
            return false
        }
    }

    return true
}