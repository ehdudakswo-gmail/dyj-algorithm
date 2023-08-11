package baekjoon.p02684

fun main(args: Array<String>) {
    repeat(readLine()!!.toInt()) {
        println(solve(readLine()!!).joinToString(" "))
    }
}

private fun solve(input: String): List<Int> {
    return arrayOf("TTT", "TTH", "THT", "THH", "HTT", "HTH", "HHT", "HHH").map { cnt(input, it) }
}

private fun cnt(str: String, target: String): Int {
    var ret = 0
    val targetLen = target.length

    for (i in 0..(str.length - targetLen)) {
        if (str.substring(i, i + targetLen) == target) {
            ret++
        }
    }

    return ret
}