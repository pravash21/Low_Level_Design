package com.SnakeAndLadder;

import com.SnakeAndLadder.Model.Board;
import com.SnakeAndLadder.Model.Cell;
import com.SnakeAndLadder.Model.Player;
import com.SnakeAndLadder.Services.Dice;

import java.util.Deque;
import java.util.LinkedList;

public class Game {
    Board board;
    Dice dice;
    Deque<Player> playersList = new LinkedList<>();
    Player winner;

    public Game(){

        initializeGame();
    }

    private void initializeGame() {

        board = new Board(10, 5,4);
        dice = new Dice(1);
        winner = null;
        addPlayers();
    }

    private void addPlayers() {
        Player player1 = new Player("rocky", 0);
        Player player2 = new Player("raj", 0);
        playersList.add(player1);
        playersList.add(player2);
    }

    public void startGame(){

        while(winner == null) {

            //check whose turn now
            Player playerTurn = findPlayerTurn();
            System.out.println("player turn is:" + playerTurn.getId() + " current position is: " + playerTurn.getCurrentPosition());

            //roll the dice
            int diceNumbers = dice.rollDice();

            //get the new position




            int playerNewPosition = playerTurn.getCurrentPosition() + diceNumbers;
            playerNewPosition = jumpCheck(playerNewPosition);
            playerTurn.setCurrentPosition(playerNewPosition);

            System.out.println("player turn is:" + playerTurn.getId() + " new Position is: " + playerNewPosition);
            //check for winning condition
            if(playerNewPosition >= board.getCells().length * board.getCells().length-1){

                winner = playerTurn;
            }


        }

        System.out.println("WINNER IS:" + winner.getId());
    }


    private Player findPlayerTurn() {

        Player playerTurns = playersList.removeFirst();
        playersList.addLast(playerTurns);
        return playerTurns;
    }

    private int jumpCheck (int playerNewPosition) {

        if(playerNewPosition > board.getCells().length * board.getCells().length-1 ){
            return playerNewPosition;
        }

        Cell cell = board.getCell(playerNewPosition);
        if(cell.getJump() != null && cell.getJump().getStart() == playerNewPosition) {
            String jumpBy = (cell.getJump().getStart() < cell.getJump().getEnd())? "ladder" : "snake";
            System.out.println("jump done by: " + jumpBy);
            return cell.getJump().getEnd();
        }
        return playerNewPosition;
    }

}
