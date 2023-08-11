package baekjoon.p06443

fun main() {
    val n = readLine()!!.toInt()
    val inputs = List(n) { readLine()!! }

    for (solve in solve(inputs)) {
        println(solve)
    }
}

private fun solve(inputs: List<String>): List<String> {
    val ret = ArrayList<String>()
    val permutation = Permutation()

    for (input in inputs) {
        ret.addAll(permutation.getAll(input))
    }

    return ret
}

private class Permutation {

    fun getAll(input: String): List<String> {
        val ret = ArrayList<String>()
        var str = input.toCharArray().sorted().joinToString("")
        ret.add(str)

        while (true) {
            str = getNext(str)
            if (str.isEmpty()) {
                break
            }
            ret.add(str)
        }

        return ret
    }

    fun getNext(input: String): String {
        val arr = input.toCharArray()
        val startIdx = (arr.lastIndex - 1 downTo 0).find { arr[it] < arr[it + 1] }
                ?: return ""
        val minIdx = (arr.lastIndex downTo startIdx + 1).find { arr[it] > arr[startIdx] }
                ?: return ""

        swap(arr, startIdx, minIdx)
        arr.sort(startIdx + 1)

        return arr.joinToString("")
    }

    private fun swap(arr: CharArray, a: Int, b: Int) {
        val temp = arr[a]
        arr[a] = arr[b]
        arr[b] = temp
    }

}