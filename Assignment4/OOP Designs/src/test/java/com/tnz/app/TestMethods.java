package com.tnz.app;

import com.tnz.app.domain.Apple;
import com.tnz.app.domain.Banana;
import com.tnz.app.domain.Fruit;
import org.junit.Assert;
import org.junit.Test;

/**
 * Created by Admin on 3/27/16.
 */
public class TestMethods {

    @Test
    public void objectsOfFruit(){
        Assert.assertTrue(new Banana(50, true, "yellow") instanceof Fruit);
        Assert.assertTrue(new Apple(10, true, "green") instanceof Fruit);
    }

    @Test
    public void testFruit(){
        Fruit apple = new Apple(10,false,"green");

        Assert.assertEquals("I am an apple", apple.typeOfFruit());
    }

}
