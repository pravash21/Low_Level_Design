package com.SnakeAndLadder.Services;

public class Dice {
    int diceCount;
    int min = 1;
    int max =6;

    public Dice(int diceCount){
        this.diceCount = diceCount;
    }

    public int rollDice(){

        int totalSum=0;
        int diceUsed=0;

        while(diceUsed<diceCount){

            totalSum += (int) Math.floor(Math.random()*(max-min+1)+min);
            diceUsed++;
        }

        return totalSum;
    }

}
