public class Grid {
    static final int size = 10;
    private Cell[][] cells;

    public Grid() {
        cells = new Cell[size][size];
        initializeCells();
    }

    private void initializeCells() {
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                cells[i][j] = new Cell();
            }
        }
    }

    public Cell getCell(int x, int y) {
        return cells[x][y];
    }

    public void print() {
        System.out.println("  0123456789");
        for (int i = 0; i < size; i++) {
            System.out.print(i + " ");
            for (int j = 0; j < size; j++) {
                System.out.print(cells[i][j].getDisplayChar());
            }
            System.out.println();
        }
    }
}
