package baekjoon.p11098

fun main(args: Array<String>) {
    repeat(readLine()!!.toInt()) {
        val p = readLine()!!.toInt()
        val inputs = ArrayList<P11098Kt>()

        repeat(p) {
            val input = readLine()!!.split(" ")
            inputs.add(P11098Kt(input[0].toInt(), input[1]))
        }

        println(inputs.maxBy { P11098Kt -> P11098Kt.price }!!.name)
    }
}

private class P11098Kt(val price: Int, val name: String)