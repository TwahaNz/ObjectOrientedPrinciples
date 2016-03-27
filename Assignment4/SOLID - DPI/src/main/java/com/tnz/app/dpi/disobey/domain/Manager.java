package com.tnz.app.dpi.disobey.domain;

/**
 * Created by Admin on 3/27/16.
 */
public class Manager {

    private String id;

    //This breaks the Dependency Inversation Principle because the most complex class depends on low class to function
    private Worker worker;
    private OvertimeWorker overtimeWorker;

    public Manager(String id){
        this.id = id;
    }

    //Complex code has to be introduced for each worker class. There causing double the code.
    public String getNormalWorker(){
        return worker.work();
    }

    public String getOverttimeWorker(){
        return  overtimeWorker.work();
    }
}
