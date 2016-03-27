package com.tnz.app.dpi.disobey.domain;

/**
 * Created by Admin on 3/27/16.
 */
public class OvertimeWorker {


    private String id;

    public OvertimeWorker(String id) {
        this.id = id;
    }

    public String work(){
        return "Worker " + id + " works overttime";
    }

}
