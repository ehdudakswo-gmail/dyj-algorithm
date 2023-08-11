package baekjoon.p10845

fun main(args: Array<String>) {
    val queue = P10845()
    val n = readLine()!!.toInt()

    repeat(n) {
        val inputs = readLine()!!.split(" ")
        when (inputs[0]) {
            "push" -> queue.push(inputs[1].toInt())
            "pop" -> println(queue.pop())
            "size" -> println(queue.size())
            "empty" -> println(queue.empty())
            "front" -> println(queue.front())
            "back" -> println(queue.back())
        }
    }
}

private class P10845 {

    val list = IntArray(10001)
    var front = 0
    var back = 0

    fun push(n: Int) {
        list[back++] = n
    }

    fun pop(): Int {
        return when (isEmpty()) {
            true -> -1
            false -> list[front++]
        }
    }

    fun size(): Int {
        return (back - front)
    }

    fun empty(): Int {
        return when (isEmpty()) {
            true -> 1
            false -> 0
        }
    }

    fun front(): Int {
        return when (isEmpty()) {
            true -> -1
            false -> list[front]
        }
    }

    fun back(): Int {
        return when (isEmpty()) {
            true -> -1
            false -> list[back - 1]
        }
    }

    private fun isEmpty(): Boolean {
        return (front == back)
    }

}