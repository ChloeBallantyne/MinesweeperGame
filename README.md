# Minesweeper Game

## Overview
The Minesweeper Game is a classic single-player puzzle game where the player must clear a rectangular board containing hidden mines without detonating any of them. The player wins the game by revealing all the cells on the board that do not contain mines.

## Project Structure

### 1. `Cell.java`
- The `Cell` class represents an individual cell on the Minesweeper grid. It contains attributes such as whether the cell contains a mine, whether it has been revealed, and the number of adjacent mines.

### 2. `Grid.java`
- The `Grid` class represents the Minesweeper grid, which consists of multiple cells. It initializes the grid, provides access to individual cells, and prints the grid with cell contents.

### 3. `GamePlay.java`
- The `GamePlay` class handles the game logic, including setting up the grid, placing mines, calculating adjacent mines, and executing player moves.

### 4. `Main.java`
- The `Main` class contains the `main` method and serves as the entry point for the Minesweeper game. It creates an instance of `GamePlay` and starts the game.

## Functionality
- The game initializes a grid with a size of 10x10 cells.
- It randomly places 10 mines on the grid.
- It calculates the number of adjacent mines for each cell.
- Players can reveal cells by entering row and column coordinates.
- If a revealed cell contains a mine, the game ends, and the player loses.
- If all non-mine cells are revealed, the player wins the game.

## Getting Started
1. Compile all Java files in the project.
2. Run the `Main` class, which will start the Minesweeper game.
3. Follow the prompts to reveal cells and play the game.
