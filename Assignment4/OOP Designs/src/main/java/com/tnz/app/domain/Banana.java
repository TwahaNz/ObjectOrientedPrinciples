package com.tnz.app.domain;

/**
 * Created by Admin on 3/27/16.
 */
public class Banana extends Fruit {

    public Banana(int numberOfSeeds, boolean isPeeling, String colour) {
        super(numberOfSeeds, isPeeling, colour);
    }

    @Override
    public String typeOfFruit(){
        return "I am a banana";
    }
}
