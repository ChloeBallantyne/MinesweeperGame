public class Cell {
    private boolean mine;
    private boolean revealed;
    private int adjacentMines;

    public Cell() {
        mine = false;
        revealed = false;
        adjacentMines = 0;
    }

    public boolean isMine() {
        return mine;
    }

    public void setMine(boolean mine) {
        this.mine = mine;
    }

    public boolean isRevealed() {
        return revealed;
    }

    public void setRevealed(boolean revealed) {
        this.revealed = revealed;
    }

    public int getAdjacentMines() {
        return adjacentMines;
    }

    public void setAdjacentMines(int adjacentMines) {
        this.adjacentMines = adjacentMines;
    }

    public char getDisplayChar() {
        if (revealed) {
            if (mine) {
                return '*';
            } else {
                return (char) (adjacentMines + '0');
            }
        } else {
            return '-';
        }
    }
}