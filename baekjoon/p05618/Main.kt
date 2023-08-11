package baekjoon.p05618

fun main(args: Array<String>) {
    val n = readLine()!!.toInt()
    val inputs = readLine()!!.split(" ").map { it.toInt() }
    println(solve(inputs).joinToString("\n"))
}

private fun solve(inputs: List<Int>): List<Int> {
    val ret = ArrayList<Int>()
    for (i in 1..gcd(inputs)) {
        if (cd(inputs, i)) {
            ret.add(i)
        }
    }

    return ret
}

private fun gcd(list: List<Int>): Int {
    var ret = 0
    for (i in 0 until list.size - 1) {
        ret = gcd(list[i], list[i + 1])
    }

    return ret
}

private fun gcd(a: Int, b: Int): Int {
    return when (b == 0) {
        true -> a
        false -> gcd(b, a % b)
    }
}

private fun cd(list: List<Int>, d: Int): Boolean {
    for (n in list) {
        if (n % d != 0) {
            return false
        }
    }

    return true
}