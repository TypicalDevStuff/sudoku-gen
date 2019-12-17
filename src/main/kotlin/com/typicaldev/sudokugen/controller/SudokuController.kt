package com.typicaldev.sudokugen.controller

import com.typicaldev.sudoku.Level
import com.typicaldev.sudokugen.data.SudokuGrid
import com.typicaldev.sudokugen.service.SudokuService
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestParam
import org.springframework.web.bind.annotation.RestController

@RestController
class SudokuController @Autowired constructor(private val sudokuService: SudokuService) {

    @GetMapping()
    suspend fun generate(@RequestParam(value = "level", required = false) level: Level) : ResponseEntity<SudokuGrid> {
        val sudokuGrid = sudokuService.getGrid(level)

        return ResponseEntity.ok().body(sudokuGrid)
    }

    @GetMapping("/hello")
    fun hello() = "Welcome to Sudoku Generator reactivie API"
}
