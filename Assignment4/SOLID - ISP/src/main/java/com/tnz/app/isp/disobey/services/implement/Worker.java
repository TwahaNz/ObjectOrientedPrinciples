package com.tnz.app.isp.disobey.services.implement;

import com.tnz.app.isp.disobey.services.IWork;

/**
 * Created by Admin on 3/27/16.
 */
public class Worker implements IWork {

    private String id;

    public Worker(String id) {
        this.id = id;
    }

    public String getId() {
        return id;
    }

    public String work() {

        return "Worker " + id + " is working";
    }

    public String lunchBreak() {
        return "Worker " + id + " is having lunch";
    }
}