package pl.softona.adventofcode2022.task

object Day1 {

    fun task1(input: List<String>): String = getCaloriesPerElf(input).max().toString()

    fun task2(input: List<String>): String {
        val caloriesPerElf = getCaloriesPerElf(input)
        caloriesPerElf.sortDescending()

        return caloriesPerElf.take(3).sum().toString()
    }

    private fun getCaloriesPerElf(input: List<String>): MutableList<Long> {
        val caloriesPerElf = mutableListOf<Long>()
        var calories = 0L
        input.forEach {
            if (it.trim().isEmpty()) {
                caloriesPerElf.add(calories)
                calories = 0L
            } else {
                calories += it.toLong()
            }
        }
        caloriesPerElf.add(calories)
        return caloriesPerElf
    }
}
