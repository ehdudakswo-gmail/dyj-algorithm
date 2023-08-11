package baekjoon.p02941

fun main(args: Array<String>) {
    println(solve(readLine()!!))
}

private fun solve(input: String): Int {
    val arr = arrayOf("c=", "c-", "dz=", "d-", "lj", "nj", "s=", "z=")
    var str = input
    var ret = 0

    while (str.isNotEmpty()) {
        str = str.substring(find(str, arr).length)
        ret++
    }

    return ret
}

private fun find(str: String, arr: Array<String>): String {
    for (s in arr) {
        if (str.startsWith(s)) {
            return s
        }
    }

    return str[0].toString()
}