package baekjoon.p01371

fun main(args: Array<String>) {
    val inputs = ArrayList<String>()
    while (true) {
        val input = readLine() ?: break
        if (input == "END") {
            break
        }

        inputs.add(input)
    }

    println(solve(inputs))
}

private fun solve(inputs: ArrayList<String>): String {
    val str = inputs.joinToString("\n")
    val cnt = ('a'..'z').map { str.count { ch -> ch == it } }
    val max = cnt.max()

    return ('a'..'z').filterIndexed { index, c -> cnt[index] == max }.joinToString("")
}