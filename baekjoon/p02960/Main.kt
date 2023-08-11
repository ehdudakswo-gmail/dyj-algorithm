package baekjoon.p02960

fun main(args: Array<String>) {
    val inputs = readLine()!!.split(" ").map { it.toInt() }
    println(solve(inputs[0], inputs[1]))
}

private fun solve(n: Int, k: Int): Int {
    val prime = BooleanArray(n + 1) { true }
    prime[0] = false
    prime[1] = false

    val list = ArrayList<Int>()
    for (i in 2..n) {
        if (prime[i]) {
            list.add(i)
            for (j in i * i..n step i) {
                if (prime[j]) {
                    list.add(j)
                    prime[j] = false
                }
            }
        }
    }

    return list[k - 1]
}