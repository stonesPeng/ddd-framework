package com.medtreehealth.system.user.api

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication
import org.springframework.context.annotation.ComponentScan

@SpringBootApplication
@ComponentScan("com.medtreehealth")
class Application

fun main(args: Array<String>) {
    runApplication<Application>(*args)
}
