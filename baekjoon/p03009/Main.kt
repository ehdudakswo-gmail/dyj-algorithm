package baekjoon.p03009

fun main(args: Array<String>) {
    val xList = ArrayList<Int>(3)
    val yList = ArrayList<Int>(3)

    repeat(3) {
        val (x, y) = readLine()!!.split(" ").map { it2 -> it2.toInt() }
        xList.add(x)
        yList.add(y)
    }

    println("${solve(xList)} ${solve(yList)}")
}

private fun solve(list: ArrayList<Int>): Int {
    val hashMap = HashMap<Int, Int>()

    for (key in list) {
        if (hashMap.containsKey(key)) {
            val value = hashMap[key]
            hashMap[key] = value!!.inc()
        } else {
            hashMap[key] = 1
        }
    }

    for (key in list) {
        if (hashMap[key] == 1) {
            return key
        }
    }

    return -1
}