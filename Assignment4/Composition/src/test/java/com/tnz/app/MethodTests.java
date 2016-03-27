package com.tnz.app;

import com.tnz.app.domain.Employee;
import com.tnz.app.domain.Job;
import org.junit.Assert;
import org.junit.Test;

/**
 * Created by Admin on 3/27/16.
 */
public class MethodTests {

    Employee test;

    @Test
    public void EmployeeObjectCreation(){
        test = new Employee("Test", 0, new Job("Test",0,"Test"));
        Assert.assertNotNull(test);
    }

    @Test
    public void testSalary(){
        test = new Employee("Test", 0, new Job("Test",0,"Test"));
        Assert.assertEquals(0, test.getJobInformation().getSalaryAmount(),0);
    }

}
