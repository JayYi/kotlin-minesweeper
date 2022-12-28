package minesweeper.domain

import minesweeper.model.Height
import minesweeper.model.Point
import minesweeper.model.Width

class BlockRow(
    val blocks: List<Block>,
) {
    constructor(height: Int, width: Int) : this(
        MutableList(width) { Block(height, it) }
    )

    init {
        require(blocks.isNotEmpty()) { "BlockRow는 최소 1개의 Block을 가져야 합니다." }
    }

    fun contains(point: Point): Boolean = blocks.any { it.point == point }

    fun find(point: Point): Block? = blocks.find { it.point == point }
}
