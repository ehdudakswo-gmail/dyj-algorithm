package baekjoon.p07785

fun main(args: Array<String>) {
    val n = readLine()!!.toInt()
    val inputs = List(n) { readLine()!! }
    println(solve(inputs).joinToString("\n"))
}

private fun solve(inputs: List<String>): List<String> {
    val hashSet = HashSet<String>()
    for (input in inputs) {
        val arr = input.split(" ")
        when (arr[1]) {
            "enter" -> hashSet.add(arr[0])
            "leave" -> hashSet.remove(arr[0])
        }
    }

    return hashSet.sortedDescending()
}