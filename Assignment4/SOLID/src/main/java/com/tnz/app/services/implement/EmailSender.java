package com.tnz.app.services.implement;

import com.tnz.app.services.IEmailSender;
import com.tnz.app.domain.Email;

/**
 * Created by Admin on 3/27/16.
 */
public class EmailSender implements IEmailSender{

    private Email email;

    public EmailSender(String to, String from, String message){
        email = new Email(to, from, message);
    }

    public String getAddress(String to) {
        return email.getAddress();
    }

    public String getSender(String from) {
        return email.getFrom();
    }

    public String getMessage(String message) {
        return email.getMessage();
    }

    public Email getInstance(){
        return email;
    }

    public String sendMessage(){
        return "Email Successfully Sent To: " + email.getAddress();
    }
}
