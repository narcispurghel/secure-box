package com.github.narcispurghel.securebox

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class SecureBoxApplication

fun main(args: Array<String>) {
    runApplication<SecureBoxApplication>(*args)
}
