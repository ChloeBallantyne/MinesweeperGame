import java.util.Random;
import java.util.Scanner;

public class GamePlay {
    private Grid grid;
    private boolean gameOver;

    public GamePlay() {
        grid = new Grid();
        gameOver = false;
        placeMines();
        calculateAdjacentMines();
    }

    private void placeMines() {
        Random random = new Random();
        int minesPlaced = 0;
        while (minesPlaced < 10) {
            int x = random.nextInt(Grid.size);
            int y = random.nextInt(Grid.size);
            Cell cell = grid.getCell(x, y);
            if (!cell.isMine()) {
                cell.setMine(true);
                minesPlaced++;
            }
        }
    }

    private void calculateAdjacentMines() {
        for (int i = 0; i < Grid.size; i++) {
            for (int j = 0; j < Grid.size; j++) {
                Cell cell = grid.getCell(i, j);
                if (!cell.isMine()) {
                    int count = countAdjacentMines(i, j);
                    cell.setAdjacentMines(count);
                }
            }
        }
    }

    private int countAdjacentMines(int x, int y) {
        int count = 0;
        for (int i = Math.max(0, x - 1); i <= Math.min(x + 1, Grid.size - 1); i++) {
            for (int j = Math.max(0, y - 1); j <= Math.min(y + 1, Grid.size - 1); j++) {
                if (grid.getCell(i, j).isMine()) {
                    count++;
                }
            }
        }
        return count;
    }

    public void play() {
        Scanner scanner = new Scanner(System.in);
        while (!gameOver) {
            grid.print();
            System.out.print("Enter row and column (0-9) separated by space: ");
            int x = scanner.nextInt();
            int y = scanner.nextInt();
            if (x < 0 || x >= Grid.size || y < 0 || y >= Grid.size) {
                System.out.println("Invalid input. Please enter numbers between 0 and 9.");
                continue;
            }
            Cell cell = grid.getCell(x, y);
            if (cell.isMine()) {
                gameOver = true;
            } else {
                cell.setRevealed(true);
                if (checkWin()) {
                    gameOver = true;
                }
            }
        }
        grid.print();
        if (gameOver) {
            System.out.println("Boom! Game over.");
        } else {
            System.out.println("Congratulations! You win.");
        }
        scanner.close();
    }

    private boolean checkWin() {
        for (int i = 0; i < Grid.size; i++) {
            for (int j = 0; j < Grid.size; j++) {
                Cell cell = grid.getCell(i, j);
                if (!cell.isRevealed() && !cell.isMine()) {
                    return false;
                }
            }
        }
        return true;
    }
}
