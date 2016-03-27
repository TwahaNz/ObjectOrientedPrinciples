package com.tnz.app.services.implement;

import com.tnz.app.domain.Shapes;
import com.tnz.app.services.IDrawable;

/**
 * Created by Admin on 3/27/16.
 */
public class Square implements IDrawable {

    private Shapes shape;

    public Square(int sides, String shape){
        this.shape = new Shapes(sides, shape);
    }

    public Shapes drawShape() {
        return shape;
    }
}
