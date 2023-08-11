package baekjoon.p11557

fun main(args: Array<String>) {
    repeat(readLine()!!.toInt()) {
        val n = readLine()!!.toInt()
        val inputs = ArrayList<P11557Kt>(n)

        repeat(n) {
            val input = readLine()!!.split(" ")
            inputs.add(P11557Kt(input[0], input[1].toInt()))
        }

        val max = inputs.maxBy { input -> input.l }
        println(max!!.s)
    }
}

private class P11557Kt(val s: String, val l: Int)