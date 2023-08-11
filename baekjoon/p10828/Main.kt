package baekjoon.p10828

fun main(args: Array<String>) {
    val stack = P10828()
    repeat(readLine()!!.toInt()) {
        val inputs = readLine()!!.split(" ")
        when (inputs[0]) {
            "push" -> stack.push(inputs[1].toInt())
            "pop" -> println(stack.pop())
            "top" -> println(stack.top())
            "size" -> println(stack.size())
            "empty" -> println(stack.empty())
        }
    }
}

private class P10828 {

    val list = IntArray(10001)
    var idx = -1

    fun push(n: Int) {
        list[++idx] = n
    }

    fun pop(): Int {
        return when (isEmpty()) {
            true -> -1
            false -> list[idx--]
        }
    }

    fun top(): Int {
        return when (isEmpty()) {
            true -> -1
            false -> list[idx]
        }
    }

    fun size(): Int {
        return (idx + 1)
    }

    fun empty(): Int {
        return when (isEmpty()) {
            true -> 1
            false -> 0
        }
    }

    private fun isEmpty(): Boolean {
        return (idx == -1)
    }

}