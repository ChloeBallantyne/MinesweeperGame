# Minesweeper Console Game

This is a simplified version of the classic Minesweeper game designed to be played in the Java console.

## Description
The game randomly generates a grid of 10x10 cells, where 10 of these cells contain mines. The player's objective is to reveal all non-mine cells without triggering any mines. Each non-mine cell displays a number indicating the number of adjacent mines. The game ends when the player reveals a mine or successfully reveals all non-mine cells.

## How to Play
1. Run the `Main` class to start the game.
2. Enter row and column coordinates separated by a space to reveal a cell.
3. If the revealed cell contains a mine, the game ends with a "Boom! Game over." message.
4. If all non-mine cells are revealed, the game ends with a "Congratulations! You win." message.

## Classes
- `Grid`: Represents the game grid and contains methods for initializing the grid and printing it to the console.
- `Cell`: Represents an individual cell in the grid and stores information about whether it contains a mine, whether it has been revealed, and the number of adjacent mines.
- `MinesweeperGame`: Manages the game logic, including mine placement, calculating adjacent mines, player input, and game state.

## Usage
- Java 8 or higher is required to run the game.
- Simply compile and run the `Main` class to start playing the game in the console.


