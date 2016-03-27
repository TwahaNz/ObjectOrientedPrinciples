package com.tnz.app;

import com.tnz.app.domain.Rectangle;
import com.tnz.app.domain.Square;
import org.junit.Assert;
import org.junit.Test;

/**
 * Created by Admin on 3/27/16.
 */
public class TestMethods {

    @Test
    public void testInstance(){
        Assert.assertTrue(new Square(1,1) instanceof Rectangle);
    }
}
