package com.tnz.app.services.implement;

import com.tnz.app.services.IWork;

/**
 * Created by Admin on 3/27/16.
 */
public class OverTimeWorker implements IWork{

    private String id;

    public OverTimeWorker(String id) {
        this.id = id;
    }

    public String work() {
        return "Worker " + id + " works overtime";
    }
}
