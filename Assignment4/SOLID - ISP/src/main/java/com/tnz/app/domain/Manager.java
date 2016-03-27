package com.tnz.app.domain;

import com.tnz.app.services.ILunchable;
import com.tnz.app.services.IWork;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Admin on 3/27/16.
 */
public class Manager {

    private List<IWork> workers;
    private List<ILunchable> onBreakWorkers;
    private String id;

    public Manager(String id){
        this.id = id;
        workers = new ArrayList<IWork>();
        onBreakWorkers = new ArrayList<ILunchable>();
    }

    public void addWorker(IWork worker){
        workers.add(worker);
    }

    public void addonLunchWorkers(ILunchable worker) {onBreakWorkers.add(worker);}

    public List<IWork> getWorkers(){
        return  workers;
    }

    public List<ILunchable> getOnBreakWorkers(){
        return  onBreakWorkers;
    }

}
