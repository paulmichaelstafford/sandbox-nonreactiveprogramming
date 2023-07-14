package com.oghamstone.sandbox.sandboxnonreactiveprogramming.school.student

import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PathVariable
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/student")
class StudentController(var studentService: StudentService) {

    @GetMapping("/getNonReactive/{id}")
    fun getNonReactive(@PathVariable id: String): Student {
        return studentService.getNonReactive(id)
    }

    @GetMapping("/getAllNonReactive")
    fun getAllNonReactive(): List<Student> {
        return studentService.getAllNonReactive()
    }
}