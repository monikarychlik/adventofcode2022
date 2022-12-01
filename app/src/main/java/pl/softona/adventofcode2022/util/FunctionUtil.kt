package pl.softona.adventofcode2022.util

import java.lang.reflect.Method

object FunctionUtil {

    fun getClassByDay(day: Int): Class<*> {
        val fullClassName = "pl.softona.adventofcode2022.task.Day$day"
        return Class.forName(fullClassName)
    }

    fun getTaskFunctionInClassByNumber(classs: Class<*>, taskNumber: Int): Method {
        return classs.getMethod("task$taskNumber", List::class.java)
    }
}
