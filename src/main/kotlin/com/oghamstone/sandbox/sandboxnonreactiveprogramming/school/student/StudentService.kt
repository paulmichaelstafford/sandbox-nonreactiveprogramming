package com.oghamstone.sandbox.sandboxnonreactiveprogramming.school.student

import jakarta.annotation.PostConstruct
import org.springframework.data.mongodb.core.MongoTemplate
import org.springframework.data.mongodb.core.ReactiveMongoTemplate
import org.springframework.stereotype.Service
import reactor.core.publisher.Flux
import reactor.core.publisher.Mono

@Service
class StudentService(var mongoTemplate: MongoTemplate) {

    fun getNonReactive(id: String): Student {
        return mongoTemplate.findById(id, Student::class.java)!!
    }

    fun getAllNonReactive(): List<Student> {
        return mongoTemplate.findAll(Student::class.java)
    }
}