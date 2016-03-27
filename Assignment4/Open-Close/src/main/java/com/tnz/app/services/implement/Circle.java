package com.tnz.app.services.implement;

import com.tnz.app.domain.Shapes;
import com.tnz.app.services.IDrawable;

/**
 * Created by Admin on 3/27/16.
 */
public class Circle implements IDrawable{

    private Shapes shape;

    public Circle(int sides, String draw){
        this.shape = new Shapes(sides, draw);
    }

    public Shapes drawShape() {
        return shape;
    }
}
