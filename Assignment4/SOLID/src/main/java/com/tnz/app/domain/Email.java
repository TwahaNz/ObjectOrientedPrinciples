package com.tnz.app.domain;

/**
 * Created by Admin on 3/27/16.
 */
public class Email {

    private String address;
    private String from;
    private String message;

    public Email(String to, String from, String message) {
        this.address = to;
        this.from = from;
        this.message = message;
    }

    public String getMessage() {
        return message;
    }

    public String getFrom() {
        return from;
    }

    public String getAddress() {
        return address;
    }
}
