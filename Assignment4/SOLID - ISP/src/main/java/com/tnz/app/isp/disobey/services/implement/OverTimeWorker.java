package com.tnz.app.isp.disobey.services.implement;

import com.tnz.app.isp.disobey.services.IWork;

/**
 * Created by Admin on 3/27/16.
 */
public class OverTimeWorker implements IWork {

    private String id;

    public OverTimeWorker(String id) {
        this.id = id;
    }

    public String work() {
        return "Worker " + id + " is working;";
    }

    public String lunchBreak() {
        return "Worker " + id + " is having lunch";
    }
}
