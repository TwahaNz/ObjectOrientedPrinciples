package com.tnz.app;

import com.tnz.app.domain.Order;
import com.tnz.app.domain.Waitress;
import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Admin on 3/27/16.
 */
public class TestMethods {

    @Test
    public void testApp(){
        try{
            List<String> orderedItems = new ArrayList<String>();

            orderedItems.add("Rice and Beans");
            orderedItems.add("Sode");
            orderedItems.add("Cold Water");

            Order order = new Order(orderedItems);
            Waitress waitress = new Waitress("Samantha", order);

            waitress.totalItems();

            System.out.println(waitress.getTotal());
        }
        catch (AssertionError e){
            Assert.fail();
        }
    }
}
