package com.tnz.app;

import com.tnz.app.domain.Manager;
import com.tnz.app.services.ILunchable;
import com.tnz.app.services.IWork;
import com.tnz.app.services.implement.Machine;
import com.tnz.app.services.implement.OverTimeWorker;
import com.tnz.app.services.implement.Worker;
import org.junit.Assert;
import org.junit.Test;

import java.util.List;

/**
 * Created by Admin on 3/27/16.
 */
public class TestMethods {

    @Test
    public void testApp(){
        try{
            Manager manager = new Manager("1");

            IWork[] workers = {new OverTimeWorker("52"), new Worker("5"), new Machine("CR237"), new Machine("RTX")};

            for (IWork worker : workers) {
                manager.addWorker(worker);

                if (worker instanceof ILunchable)
                    manager.addonLunchWorkers((ILunchable) worker);
            }

            List<IWork> workingWorkers = manager.getWorkers();
            List<ILunchable> onBreakWorkers = manager.getOnBreakWorkers();

            System.out.println("Working Workers \n ================");

            for (IWork working : workingWorkers)
                System.out.println(working.work());

            System.out.println("Workers On Lunch \n ===============");
            for (ILunchable workersOnLunch : onBreakWorkers)
                System.out.println(workersOnLunch.lunchBreak());
        }
        catch (AssertionError error){
            Assert.fail();
        }
    }
}
