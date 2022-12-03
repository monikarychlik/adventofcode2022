package pl.softona.adventofcode2022.task

object Day3 {

    fun task1(input: List<String>): String {
        var sum = 0L
        input.forEach inputForEach@{
            if (it.isEmpty()) return@inputForEach

            val chunked = it.chunked(it.length / 2)
            chunked[0].forEach { type ->
                if (chunked[1].contains(type)) {
                    sum += getTypePriority(type.code).toLong()
                    return@inputForEach
                }
            }
        }
        return sum.toString()
    }

    private fun getTypePriority(charCode: Int): Int = charCode - if (charCode > 96) 96 else 38

    fun task2(input: List<String>): String {
        var sum = 0L
        for (i in 0..input.size step 3) {
            run rucksackLoop@{
                input[i].forEach { type ->
                    if (input[i + 1].contains(type) && input[i + 2].contains(type)) {
                        sum += getTypePriority(type.code)
                        return@rucksackLoop
                    }
                }
            }
        }
        return sum.toString()
    }
}
