package baekjoon.p11729

fun main(args: Array<String>) {
    val n = readLine()!!.toInt()
    val solve = P11729(n)
    println(solve.size())
    println(solve.string())
}

class P11729(val n: Int, private var size: Int = 0, private val sb: StringBuilder = StringBuilder()) {

    init {
        solve(n, 1, 2, 3)
    }

    private fun solve(n: Int, from: Int, by: Int, to: Int) {
        if (n <= 1) {
            size++
            sb.append(from)
            sb.append(" ")
            sb.append(to)
            sb.append("\n")
        } else {
            solve(n - 1, from, to, by)
            solve(1, from, by, to)
            solve(n - 1, by, from, to)
        }
    }

    fun size() = size
    fun string() = sb.toString()

}