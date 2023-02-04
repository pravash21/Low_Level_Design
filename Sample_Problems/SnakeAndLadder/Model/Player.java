package com.SnakeAndLadder.Model;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Player {
    String id;
    int currentPosition;

    public Player(String id, int currentPosition) {
        this.id = id;
        this.currentPosition = currentPosition;
    }

}
