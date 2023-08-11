package baekjoon.p12791

fun main(args: Array<String>) {
    repeat(readLine()!!.toInt()) {
        val inputs = readLine()!!.split(" ").map { it.toInt() }
        val solve = solve(inputs[0], inputs[1])
        println(solve.size)
        if (solve.isNotEmpty()) {
            println(solve.joinToString("\n"))
        }
    }
}

private fun solve(a: Int, b: Int): List<P12791> {
    return list.filter { it.a in (a..b) }
}

private class P12791(val a: Int, val b: String) {
    override fun toString(): String {
        return "$a $b"
    }
}

private val list = listOf(
        P12791(1967, "DavidBowie"),
        P12791(1969, "SpaceOddity"),
        P12791(1970, "TheManWhoSoldTheWorld"),
        P12791(1971, "HunkyDory"),
        P12791(1972, "TheRiseAndFallOfZiggyStardustAndTheSpidersFromMars"),
        P12791(1973, "AladdinSane"),
        P12791(1973, "PinUps"),
        P12791(1974, "DiamondDogs"),
        P12791(1975, "YoungAmericans"),
        P12791(1976, "StationToStation"),
        P12791(1977, "Low"),
        P12791(1977, "Heroes"),
        P12791(1979, "Lodger"),
        P12791(1980, "ScaryMonstersAndSuperCreeps"),
        P12791(1983, "LetsDance"),
        P12791(1984, "Tonight"),
        P12791(1987, "NeverLetMeDown"),
        P12791(1993, "BlackTieWhiteNoise"),
        P12791(1995, "1.Outside"),
        P12791(1997, "Earthling"),
        P12791(1999, "Hours"),
        P12791(2002, "Heathen"),
        P12791(2003, "Reality"),
        P12791(2013, "TheNextDay"),
        P12791(2016, "BlackStar")
)