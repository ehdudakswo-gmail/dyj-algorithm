package baekjoon.p09742

fun main(args: Array<String>) {
    while (true) {
        val input = readLine() ?: break
        val inputs = input.split(" ")
        println(solve(inputs[0], inputs[1].toInt()))
    }
}

private fun solve(input: String, n: Int): String {
    val arr = input.toCharArray().sorted().toCharArray()
    return "$input $n = ${solve2(list(arr), n)}"
}

private fun list(arr: CharArray): List<CharArray> {
    val ret = ArrayList<CharArray>()
    var next = arr

    while (next.isNotEmpty()) {
        ret.add(next)
        next = next(next)
    }

    return ret
}

private fun next(arr: CharArray): CharArray {
    val ret = arr.clone()
    val idx = (ret.lastIndex - 1 downTo 0).find { ret[it] < ret[it + 1] }
            ?: return emptyArray<Char>().toCharArray()
    val min = (ret.lastIndex downTo idx + 1).find { ret[it] > ret[idx] }!!

    swap(ret, idx, min)
    ret.sort(idx + 1)

    return ret
}

private fun swap(arr: CharArray, a: Int, b: Int) {
    val temp = arr[a]
    arr[a] = arr[b]
    arr[b] = temp
}

private fun solve2(list: List<CharArray>, n: Int): String {
    return when (list.size >= n) {
        true -> list[n - 1].joinToString("")
        false -> "No permutation"
    }
}