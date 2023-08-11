package baekjoon.p02529

fun main() {
    val k = readLine()!!.toInt()
    val inputs = readLine()!!.trim().split(" ")
    println(solve(inputs).joinToString("\n"))
}

private fun solve(inputs: List<String>): List<String> {
    val set = "0123456789"
    val len = inputs.size + 1
    var max = set.reversed().substring(0, len)
    var min = set.substring(0, len)

    val permutation = Permutation()
    while (!check(inputs, max)) {
        max = permutation.getPre(max)
    }

    while (!check(inputs, min)) {
        min = permutation.getNext(min)
    }

    return listOf(max, min)
}

private fun check(check: List<String>, str: String): Boolean {
    for (i in 0 until check.size) {
        val operator = check[i]
        val a = str[i]
        val b = str[i + 1]

        if (isWrong(operator, a, b)) {
            return false
        }
    }

    return true
}

private fun isWrong(operator: String, a: Char, b: Char): Boolean {
    return when {
        (operator == "<") -> (a > b)
        (operator == ">") -> (a < b)
        else -> false
    }
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

    fun getPre(input: String): String {
        val arr = input.toCharArray()
        val startIdx = (arr.lastIndex - 1 downTo 0).find { arr[it] > arr[it + 1] }
                ?: return ""
        val maxIdx = (arr.lastIndex downTo startIdx + 1).find { arr[it] < arr[startIdx] }
                ?: return ""

        swap(arr, startIdx, maxIdx)
        arr.sort(startIdx + 1)
        reverse(arr, startIdx + 1, arr.lastIndex)

        return arr.joinToString("")
    }

    private fun reverse(arr: CharArray, start: Int, end: Int) {
        var a = start
        var b = end

        while (a <= b) {
            swap(arr, a, b)
            a++
            b--
        }
    }

}