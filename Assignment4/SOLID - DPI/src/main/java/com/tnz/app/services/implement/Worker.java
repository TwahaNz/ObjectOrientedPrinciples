package com.tnz.app.services.implement;

import com.tnz.app.services.IWork;

/**
 * Created by Admin on 3/27/16.
 */
public class Worker implements IWork{

    private String id;

    public Worker(String id) {
        this.id = id;
    }

    public String getId() {
        return id;
    }

    public String work() {

        return "Worker " + id + " doesn't work overrtime";
    }
}