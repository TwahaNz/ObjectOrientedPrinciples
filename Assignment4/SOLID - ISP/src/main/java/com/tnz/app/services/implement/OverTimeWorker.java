package com.tnz.app.services.implement;

import com.tnz.app.services.ILunchable;
import com.tnz.app.services.IWork;

/**
 * Created by Admin on 3/27/16.
 */
public class OverTimeWorker implements IWork, ILunchable{

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
