package Flyweigth;

public class Cell {
    private int row;

    Cell(int row) {
        this.row = row;
    }

    public void display(int col) {
        System.out.println(row + " " + col);
    }
}
