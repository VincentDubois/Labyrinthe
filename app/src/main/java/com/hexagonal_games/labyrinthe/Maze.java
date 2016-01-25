package com.hexagonal_games.labyrinthe;

/**
 * Created by vincent.dubois on 25/01/16.
 */
public class Maze {
    private int[][] array = {
            {1,1,1,1,1},
            {1,0,0,0,0},
            {1,0,1,1,0},
            {1,0,0,1,0},
            {1,1,1,1,0},
    };

    public int getWidth() {
        return array.length;
    }

    public int getHeight() {
        return array[0].length;
    }

    public int getCode(int i, int j) {
        return array[i][j];
    }
}
