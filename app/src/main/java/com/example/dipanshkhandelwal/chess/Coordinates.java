package com.example.dipanshkhandelwal.chess;

/**
 * Created by DIPANSH KHANDELWAL on 03-06-2017
 */

public class Coordinates {
    private int x;
    private int y;

    public Coordinates(int x, int y) {
        this.x = x;
        this.y = y;
    }

    void setX(int x) {
        this.x = x;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    void setY(int y) {
        this.y = y;
    }
}
