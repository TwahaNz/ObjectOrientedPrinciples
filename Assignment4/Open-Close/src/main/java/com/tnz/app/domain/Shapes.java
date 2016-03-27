package com.tnz.app.domain;

/**
 * Created by Admin on 3/27/16.
 */
public class Shapes {

    private int sides;
    private String shape;

    public Shapes(int sides, String draw){
        this.sides = sides;
        this.shape = draw;
    }

    public String drawShape(){
        return shape;
    }

    public int getSides() {
        return sides;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Shapes shapes = (Shapes) o;

        if (sides != shapes.sides) return false;
        return shape != null ? shape.equals(shapes.shape) : shapes.shape == null;

    }

    @Override
    public int hashCode() {
        int result = sides;
        result = 31 * result + (shape != null ? shape.hashCode() : 0);
        return result;
    }
}
