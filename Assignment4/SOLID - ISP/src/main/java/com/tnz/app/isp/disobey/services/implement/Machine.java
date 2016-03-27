package com.tnz.app.isp.disobey.services.implement;

import com.tnz.app.isp.disobey.services.IWork;

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

    //Introduces a useless method due to the fat interface introduced
    public String lunchBreak() {
        return "";
    }
}
