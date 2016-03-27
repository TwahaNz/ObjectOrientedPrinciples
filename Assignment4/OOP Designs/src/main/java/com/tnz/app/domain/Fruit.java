package com.tnz.app.domain;

/**
 * Created by Admin on 3/27/16.
 */
public abstract class Fruit {

    private int numberOfSeeds;
    private boolean isPeeling;
    private String colour;

    public Fruit(int numberOfSeeds, boolean isPeeling, String colour){
        this.isPeeling = isPeeling;
        this.numberOfSeeds = numberOfSeeds;
        this.colour = colour;
    }

    public int getNumberOfSeeds(){
        return numberOfSeeds;
    }

    public boolean getIsPeeling(){
        return isPeeling;
    }

    public String getColour(){
        return colour;
    }

    public String typeOfFruit(){
        return "I am a Fruit";
    }

}
