package baekjoon.p10699

import java.text.SimpleDateFormat
import java.util.*

fun main(args: Array<String>) {
    val result = SimpleDateFormat(
            "yyyy-MM-dd",
            Locale.getDefault()
    ).format(Date())

    println(result)
}