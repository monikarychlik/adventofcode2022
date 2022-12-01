package pl.softona.adventofcode2022.util

import io.ktor.client.HttpClient
import io.ktor.client.request.get
import io.ktor.client.request.headers
import io.ktor.client.statement.HttpStatement
import io.ktor.http.HttpHeaders

object ApiUtil {

    suspend fun getInputFromApi(day: Int): List<String> {
        val client = HttpClient()
        val response: HttpStatement = client.get("https://adventofcode.com/2021/day/$day/input") {
            headers {
                append(
                    HttpHeaders.Cookie,
                    "session=53616c7465645f5f67c4995ec2d873efed185de1afd870321843bc8ba70e2fa8db700b323fbbf8046bba8dcdba490cdf1e1c727b04bc6adc09c206888303922f"
                )
            }
        }
        return response.receive<String>().split("\n")
    }
}
