package com.typicaldev.sudokugen

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class SudokuGenApplication

fun main(args: Array<String>) {
    runApplication<SudokuGenApplication>(*args)
}
