package pl.softona.adventofcode2022.task

object Day2 {

    // A X Rock
    // B Y Paper
    // C Z Scissors

    // A Y
    // B Z
    // C X

    fun task1(input: List<String>): String {
        var score = 0L
        input.forEach {
            if (it.isEmpty()) return@forEach
            val opponentMove = it.trim().first()
            val myMove = it.trim().last()

            score += addOutcome(opponentMove, myMove)
            score += when (myMove) {
                'X' -> 1L
                'Y' -> 2L
                'Z' -> 3L
                else -> 0L
            }
        }
        return score.toString()
    }

    private fun addOutcome(oponentMove: Char, myMove: Char): Long =
        when (oponentMove) {
            'A' -> if (myMove == 'Y') 6L else if (myMove == 'X') 3L else 0L
            'B' -> if (myMove == 'Z') 6L else if (myMove == 'Y') 3L else 0L
            'C' -> if (myMove == 'X') 6L else if (myMove == 'Z') 3L else 0L
            else -> 0L
        }

    // X loose
    // Y draw
    // Z win

    fun task2(input: List<String>): String {
        var score = 0L
        input.forEach {
            if (it.isEmpty()) return@forEach
            val opponentMove = it.trim().first()
            val myMove = it.trim().last()

            score += when (opponentMove) {
                'A' -> if (myMove == 'X') 3L else if (myMove == 'Y') 4L else 8L
                'B' -> if (myMove == 'X') 1L else if (myMove == 'Y') 5L else 9L
                'C' -> if (myMove == 'X') 2L else if (myMove == 'Y') 6L else 7L
                else -> 0L
            }
        }
        return score.toString()
    }
}
