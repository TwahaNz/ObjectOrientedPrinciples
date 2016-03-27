package com.tnz.app.dpi.disobey.domain;

/**
 * Created by Admin on 3/27/16.
 */
public class Worker {

    private String id;

    public Worker(String id) {
        this.id = id;
    }

    public String work(){
        return "Worker " + id + " doesn't work overttime";
    }
}
