package baekjoon.p04806

fun main(args: Array<String>) {
    var ret = 0
    while (true) {
        val input = readLine() ?: break
        if (input == "END") {
            break
        }

        ret++
    }
    println(ret)
}