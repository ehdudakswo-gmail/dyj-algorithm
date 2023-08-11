package baekjoon.p01316

fun main(args: Array<String>) {
    val n = readLine()!!.toInt()
    val inputs = Array(n) { readLine()!! }
    println(solve(inputs))
}

private fun solve(inputs: Array<String>): Int {
    return inputs.count { check(it) }
}

private fun check(str: String): Boolean {
    val hashSet = HashSet<Char>()
    hashSet.add(str[0])

    for (i in 1..str.lastIndex) {
        val pre = str[i - 1]
        val current = str[i]

        if (hashSet.contains(current) && pre != current) {
            return false
        } else {
            hashSet.add(current)
        }
    }

    return true
}