package pl.softona.adventofcode2022

import android.os.Build
import androidx.annotation.RequiresApi
import kotlinx.coroutines.launch
import kotlinx.coroutines.runBlocking
import pl.softona.adventofcode2022.util.ApiUtil
import pl.softona.adventofcode2022.util.SolutionUtil

object Main {

    private const val DAY = 3
    private const val TASK_NUMBER = 2

    @RequiresApi(Build.VERSION_CODES.N)
    @JvmStatic
    fun main(args: Array<String>) {
        runBlocking {
            launch {
                val solution = SolutionUtil.getSolution(
                    day = DAY,
                    taskNumber = TASK_NUMBER,
                    input = ApiUtil.getInputFromApi(DAY)
                )
                println(solution)
            }
        }
    }
}
