package com.tnz.app.tests;

import com.tnz.app.domain.Shapes;
import com.tnz.app.services.implement.Circle;
import com.tnz.app.services.implement.Square;

/**
 * Created by Admin on 3/27/16.
 */
public class App {

    public static void main( String[] args )
    {
        Shapes circle = new Circle(0,"Round").drawShape();
        Shapes square = new Square(4,"Square").drawShape();

        Shapes[] shapes = new Shapes[]{circle, square};

        for (Shapes shape : shapes)
            System.out.println("Drawing " + shape.drawShape() + " shape");
    }
}
