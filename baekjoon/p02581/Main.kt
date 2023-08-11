package baekjoon.p02581

fun main(args: Array<String>) {
    val m = readLine()!!.toInt()
    val n = readLine()!!.toInt()

//    val solve = solve(m, n)
    val solve2 = solve2(m, n)

    for (ret in solve2) {
        println(ret)
    }
}

private fun solve(m: Int, n: Int): IntArray {
    val ret = IntArray(2)
    val list = ArrayList<Int>()

    for (i in m..n) {
        if (isPrime(i)) {
            list.add(i)
        }
    }

    if (list.size == 0) {
        return IntArray(1) { -1 }
    }

    ret[0] = list.sum()
    ret[1] = list[0]

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

private fun solve2(m: Int, n: Int): IntArray {
    val ret = IntArray(2)
    val list = ArrayList<Int>()
    val prime = getPrime(n)

    for (i in m..n) {
        if (prime[i]) {
            list.add(i)
        }
    }

    if (list.size == 0) {
        return IntArray(1) { -1 }
    }

    ret[0] = list.sum()
    ret[1] = list[0]

    return ret
}

private fun getPrime(n: Int): BooleanArray {
    val prime = BooleanArray(n + 1) { true }

    prime[0] = false
    prime[1] = false

    for (i in 2..n) {
        if (prime[i]) {
            for (j in i * 2..n step i) {
                prime[j] = false
            }
        }
    }

    return prime
}