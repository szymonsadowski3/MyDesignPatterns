package Flyweigth;

public class CellFactory {
    private Cell[] cache;

    CellFactory(int maxRows) {
        this.cache = new Cell[maxRows];
    }

    public Cell getCell(int row) {
        if (cache[row] == null)
            cache[row] = new Cell(row);

        return cache[row];
    }
}
