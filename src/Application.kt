package com.kotlincp

import com.kotlincp.model.Problem
import io.ktor.application.*
import io.ktor.response.*
import io.ktor.request.*
import io.ktor.routing.*
import io.ktor.http.*
import io.ktor.gson.*
import io.ktor.features.*
import java.io.File

fun main(args: Array<String>): Unit = io.ktor.server.netty.EngineMain.main(args)

@Suppress("unused") // Referenced in application.conf
@kotlin.jvm.JvmOverloads
fun Application.module(testing: Boolean = false) {
    install(ContentNegotiation) {
        gson {
            setPrettyPrinting()
            enableComplexMapKeySerialization()
        }
    }

    routing {
        get("/") {
            call.respond(mapOf("hello" to "world"))
        }

        post("/") {
            val problem = call.receive<Problem>()
            File("./test_contest.txt").appendText(problem.name)
                File("./test_contest.txt").appendText(System.lineSeparator())
            File("./test_contest.txt").appendText(problem.group)
                File("./test_contest.txt").appendText(System.lineSeparator())
            File("./test_contest.txt").appendText(problem.url)
                File("./test_contest.txt").appendText(System.lineSeparator())
            File("./test_contest.txt").appendText(problem.interactive.toString())
                File("./test_contest.txt").appendText(System.lineSeparator())
            File("./test_contest.txt").appendText(problem.memoryLimit.toString())
                File("./test_contest.txt").appendText(System.lineSeparator())
            File("./test_contest.txt").appendText(problem.timeLimit.toString())
                File("./test_contest.txt").appendText(System.lineSeparator())
            File("./test_contest.txt").appendText(problem.tests.toString())
                File("./test_contest.txt").appendText(System.lineSeparator())
            File("./test_contest.txt").appendText(problem.testType.toString())
                File("./test_contest.txt").appendText(System.lineSeparator())
            File("./test_contest.txt").appendText(problem.input.toString())
                File("./test_contest.txt").appendText(System.lineSeparator())
            File("./test_contest.txt").appendText(problem.output.toString())
                File("./test_contest.txt").appendText(System.lineSeparator())
            File("./test_contest.txt").appendText(problem.languages.toString())
                File("./test_contest.txt").appendText(System.lineSeparator())
                File("./test_contest.txt").appendText(System.lineSeparator())

            call.respond(HttpStatusCode.OK)
        }
    }
}

