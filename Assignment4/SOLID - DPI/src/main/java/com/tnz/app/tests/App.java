package com.tnz.app.tests;

import com.tnz.app.domain.Manager;
import com.tnz.app.services.IWork;
import com.tnz.app.services.implement.OverTimeWorker;
import com.tnz.app.services.implement.Worker;
import java.util.List;

/**
 * Created by Admin on 3/27/16.
 */

public class App {

    public static void main( String[] args )
    {
        Manager manager = new Manager("1");

        IWork[] workers = {new Worker("45"),  new OverTimeWorker("52"), new Worker("5")};

        for (IWork worker : workers)
            manager.addWorker(worker);

        List<IWork> workingWorkers = manager.getWorkers();

        for (IWork working : workingWorkers)
            System.out.println(working.work());
    }
}
