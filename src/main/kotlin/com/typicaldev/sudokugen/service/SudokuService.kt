package com.typicaldev.sudokugen.service

import com.typicaldev.sudoku.Level
import com.typicaldev.sudoku.Sudoku
import com.typicaldev.sudokugen.data.SudokuGrid
import org.springframework.stereotype.Service

@Service
class SudokuService {

    suspend fun getGrid(level: Level?): SudokuGrid {
        val sudokuBuilder = Sudoku.Builder()
        val sudoku = if (level != null) sudokuBuilder.setLevel(level).build() else sudokuBuilder.build()

        return SudokuGrid(sudoku.level, sudoku.grid)
    }
}
