package baekjoon.p10866

fun main(args: Array<String>) {
    val n = readLine()!!.toInt()
    val deque = P10866(n)

    repeat(n) {
        val inputs = readLine()!!.split(" ")
        when (inputs[0]) {
            "push_front" -> deque.pushFront(inputs[1].toInt())
            "push_back" -> deque.pushBack(inputs[1].toInt())
            "pop_front" -> println(deque.popFront())
            "pop_back" -> println(deque.popBack())
            "size" -> println(deque.size())
            "empty" -> println(deque.empty())
            "front" -> println(deque.front())
            "back" -> println(deque.back())
        }
    }
}

private class P10866(n: Int) {

    val list = IntArray(n * 2)
    var front = n
    var back = n

    fun pushFront(n: Int) {
        list[--front] = n
    }

    fun pushBack(n: Int) {
        list[back++] = n
    }

    fun popFront(): Int {
        return when (isEmpty()) {
            true -> -1
            false -> list[front++]
        }
    }

    fun popBack(): Int {
        return when (isEmpty()) {
            true -> -1
            false -> list[--back]
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