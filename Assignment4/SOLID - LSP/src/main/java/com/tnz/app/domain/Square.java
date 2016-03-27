package com.tnz.app.domain;

/**
 * Created by Admin on 3/27/16.
 */
public class Square extends Rectangle {

    private int length;
    private int width;

    public Square(int length, int width) {
        super(length, width);
    }

    //Violets the LSP since it overrides the super class
    @Override
    public int calculateArea(){
        return length * width;
    }
}
