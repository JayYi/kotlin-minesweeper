package domain

class BoardRow(height: Int, width: Int, mines: Mines) {
    val cells = List(width) { col ->
        BoardItem.getItemType(mines.contains(height, col))
    }.toMutableList()

    operator fun get(idx: Int) = cells[idx]
}