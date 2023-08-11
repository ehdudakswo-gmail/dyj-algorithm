package baekjoon.p02609

fun main(args: Array<String>) {
    val input = readLine()!!.split(" ")
    val a = input[0].toInt()
    val b = input[1].toInt()

    for (ret in solve(a, b)) {
        println(ret)
    }
}

private fun solve(a: Int, b: Int): IntArray {
    val ret = IntArray(2)

    val gcd = gcd(a, b)
    val lcm = (a * b) / gcd

    ret[0] = gcd
    ret[1] = lcm

    return ret
}

private fun gcd(a: Int, b: Int): Int {
    if (a % b == 0) {
        return b
    }

    return gcd(b, a % b)
}