package com.typicaldev.sudokugen.data

import com.typicaldev.sudoku.Level

data class SudokuGrid(val level: Level, val grid: Array<IntArray>) {

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (javaClass != other?.javaClass) return false

        other as SudokuGrid

        if (level != other.level) return false
        if (!grid.contentDeepEquals(other.grid)) return false

        return true
    }

    override fun hashCode(): Int {
        var result = level.hashCode()
        result = 31 * result + grid.contentDeepHashCode()
        return result
    }
}
