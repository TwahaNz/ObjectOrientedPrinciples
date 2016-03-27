package com.tnz.app.tests;

import static java.lang.System.*;
import com.tnz.app.domain.Apple;
import com.tnz.app.domain.Banana;
import com.tnz.app.domain.Fruit;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        Fruit apple = new Apple(10,false,"green");
        Fruit banana = new Banana(50, true, "yellow");

        Fruit[] fruits = new Fruit[]{apple, banana};

        for (Fruit typeFruit : fruits)
            out.println("What Type Of Fruit: " + typeFruit.typeOfFruit());

    }
}
