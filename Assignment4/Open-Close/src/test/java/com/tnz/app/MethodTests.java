package com.tnz.app;

import com.tnz.app.services.IDrawable;
import com.tnz.app.services.implement.Circle;
import org.junit.Assert;
import org.junit.Test;

/**
 * Created by Admin on 3/27/16.
 */
public class MethodTests {

    private IDrawable circle;

    @Test
    public void testInterface() throws Exception {
        circle = new Circle(0, "Round");
        Assert.assertNotNull(circle);
    }

    @Test
    public void testShape(){
        circle = new Circle(0, "Round");
        Assert.assertEquals("Round", circle.drawShape().drawShape());
    }
}
