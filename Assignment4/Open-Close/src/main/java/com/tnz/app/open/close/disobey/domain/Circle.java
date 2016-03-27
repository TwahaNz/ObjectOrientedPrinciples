package com.tnz.app.open.close.disobey.domain;

import com.tnz.app.open.close.disobey.domain.Shapes;

/**
 * Created by Admin on 3/27/16.
 */
public class Circle {

    private Shapes shape;

    public Circle(int sides, String draw){
        this.shape = new Shapes(sides, draw);
    }

    public Shapes drawShape() {
        return shape;
    }
}
