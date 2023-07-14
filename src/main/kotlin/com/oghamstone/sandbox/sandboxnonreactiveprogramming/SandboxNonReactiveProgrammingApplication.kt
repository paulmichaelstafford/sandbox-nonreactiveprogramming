package com.oghamstone.sandbox.sandboxnonreactiveprogramming

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication
import org.springframework.data.mongodb.repository.config.EnableReactiveMongoRepositories

@SpringBootApplication
@EnableReactiveMongoRepositories
class SandboxNonReactiveProgrammingApplication

fun main(args: Array<String>) {
	runApplication<SandboxNonReactiveProgrammingApplication>(*args)
}
