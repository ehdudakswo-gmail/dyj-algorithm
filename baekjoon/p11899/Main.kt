package baekjoon.p11899

import java.util.*

fun main() {
    println(solve(readLine()!!))
}

private fun solve(input: String): Int {
    var ret = 0
    val stack = Stack<Char>()

    for (ch in input) {
        when (ch) {
            '(' -> stack.push(ch)
            ')' -> {
                if (stack.isEmpty()) {
                    ret++
                } else {
                    stack.pop()
                }
            }
        }
    }

    ret += stack.size
    return ret
}