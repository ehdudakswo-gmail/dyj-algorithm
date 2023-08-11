package baekjoon.p11931

import java.io.BufferedReader
import java.io.BufferedWriter
import java.io.InputStreamReader
import java.io.OutputStreamWriter

const val limit = 1000000

fun main(args: Array<String>) {
    val brIn = BufferedReader(InputStreamReader(System.`in`))
    val brOut = BufferedWriter(OutputStreamWriter(System.`out`))
    val check = BooleanArray(limit * 2 + 1)

    repeat(readLine()!!.toInt()) {
        val idx = brIn.readLine().toInt() + limit
        check[idx] = true
    }

    for (solve in solve(check)) {
        brOut.write(solve.toString())
        brOut.newLine()
    }

    brIn.close()
    brOut.close()
}

private fun solve(check: BooleanArray): List<Int> {
    val ret = ArrayList<Int>()
    for (i in check.lastIndex downTo 0) {
        if (check[i]) {
            ret.add(i - limit)
        }
    }

    return ret
}