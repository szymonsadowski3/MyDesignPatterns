package Flyweigth;

public class Main {
    public static void main(String[] args) {
        CellFactory cellFactory = new CellFactory(5);
        for(int i=0; i< 5; i++) {
            for(int j=0; j<5; j++) {
                cellFactory.getCell(i).display(j);
            }
        }
    }
}
