package com.SnakeAndLadder.Model;

import lombok.Getter;

@Getter
public class Board {
    private Cell[][] cells;

    public Board(int boardSize, int numberOfSnakes, int numberOfLadders) {

        initializeCells(boardSize);
        addSnakesLadders(cells, numberOfSnakes, numberOfLadders);
    }

    private void initializeCells(int boardSize) {

        cells = new Cell[boardSize][boardSize];

        for(int i=0;i<boardSize;i++) {
            for(int j=0; j<boardSize;j++) {
                Cell cellObj = new Cell();
                cells[i][j] = cellObj;
            }
        }
    }

    private void addSnakesLadders(Cell[][] cells, int numberOfSnakes, int numberOfLadders){

        while(numberOfSnakes > 0) {
            int snakeHead = (int) Math.floor(Math.random()*(cells.length*cells.length)+1);
            int snakeTail = (int) Math.floor(Math.random()*(cells.length*cells.length)+1);
            if(snakeTail >= snakeHead) {
                continue;
            }

            Jump snakeObj = new Jump();
            snakeObj.start = snakeHead;
            snakeObj.end = snakeTail;

            Cell cell = getCell(snakeHead);
            cell.jump = snakeObj;

            numberOfSnakes--;
        }

        while(numberOfLadders > 0) {
            int ladderStart = (int) Math.floor(Math.random()*(cells.length*cells.length+1));
            int ladderEnd = (int) Math.floor(Math.random()*(cells.length*cells.length+1));
            if(ladderStart >= ladderEnd) {
                continue;
            }

            Jump ladderObj = new Jump();
            ladderObj.start = ladderStart;
            ladderObj.end = ladderEnd;

            Cell cell = getCell(ladderStart);
            cell.jump = ladderObj;

            numberOfLadders--;
        }

    }

    public Cell getCell(int position) {
        int boardRow = position / cells.length;
        int boardColumn = (position % cells.length);
        return cells[boardRow][boardColumn];
    }
}
