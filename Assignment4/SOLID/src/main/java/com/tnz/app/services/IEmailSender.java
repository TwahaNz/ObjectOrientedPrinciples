package com.tnz.app.services;

/**
 * Created by Admin on 3/27/16.
 */
public interface IEmailSender {

    String getAddress(String to);
    String getSender(String from);
    String getMessage(String message);
}
