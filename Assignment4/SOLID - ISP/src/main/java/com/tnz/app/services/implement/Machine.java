package com.tnz.app.services.implement;

import com.tnz.app.services.IWork;

/**
 * Created by Admin on 3/27/16.
 */
public class Machine implements IWork {

    private String id;

    public Machine(String id) {
        this.id = id;
    }

    public String work() {
        return "Machine " + id + " is working";
    }
}
