package com.tnz.app;

import com.tnz.app.domain.Email;
import com.tnz.app.services.implement.EmailSender;
import org.junit.Assert;
import org.junit.Test;

/**
 * Created by Admin on 3/27/16.
 */
public class TestMethods {

    private EmailSender emailSender;

    @Test
    public void testAddress(){
        emailSender = new EmailSender("pete@gmail.com", "twahanz@gmail.com", "Hey man how you doing");
        Assert.assertEquals("pete@gmail.com", emailSender.getInstance().getAddress());
    }


    @Test
    public void testFrom(){
        emailSender = new EmailSender("pete@gmail.com", "twahanz@gmail.com", "Hey man how you doing");
        Assert.assertEquals("twahanz@gmail.com", emailSender.getInstance().getFrom());
    }
}
