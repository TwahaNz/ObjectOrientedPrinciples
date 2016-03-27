package com.tnz.app.domain;

/**
 * Created by Admin on 3/27/16.
 */
public class Rectangle {

    private int length;
    private int width;

    public Rectangle(int length, int width) {
        this.length = length;
        this.width = width;
    }

    public int calculateArea(){
        return length * width;
    }
}
