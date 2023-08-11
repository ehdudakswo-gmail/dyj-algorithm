package baekjoon.p05635

fun main(args: Array<String>) {
    val n = readLine()!!.toInt()
    val inputs = ArrayList<P05635Kt>(n)

    repeat(n) {
        val input = readLine()!!.split(" ")
        inputs.add(P05635Kt(
                input[0],
                input[1].toInt(),
                input[2].toInt(),
                input[3].toInt())
        )
    }

    for (ret in solve(inputs)) {
        println(ret)
    }
}

private fun solve(inputs: ArrayList<P05635Kt>): Array<String> {
    val ret = Array(2) { "" }

    inputs.sortWith(P05635KtComparator())
    ret[0] = inputs.last().name
    ret[1] = inputs.first().name

    return ret
}

private class P05635Kt(val name: String, val d: Int, val m: Int, val y: Int) {

    fun getIntDate(): Int {
        return (10000 * y + 100 * m + d)
    }

}

private class P05635KtComparator : Comparator<P05635Kt> {

    override fun compare(p0: P05635Kt?, p1: P05635Kt?): Int {
        return (p0!!.getIntDate()).compareTo(p1!!.getIntDate())
    }

}