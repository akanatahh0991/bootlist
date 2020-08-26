package com.example.bootlist

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class BootlistApplication

fun main(args: Array<String>) {
	runApplication<BootlistApplication>(*args)
}
