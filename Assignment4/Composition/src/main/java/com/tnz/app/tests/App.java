package com.tnz.app.tests;

import com.tnz.app.domain.Employee;
import com.tnz.app.domain.Job;
import static java.lang.System.*;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        Employee employee = new Employee("Twaha", 214308189, new Job("Developer",20000,"OpenBox Software"));
        Employee employee1 = new Employee("Peter", 265, new Job("Web Designer", 23000, "Pepkor"));
        Employee employee2 = new Employee("Kevin", 1215441, new Job("Game Developer", 26000, "EA"));

        Employee[] employees = new Employee[]{employee,employee1, employee2};

        for (Employee workers : employees)
            out.println(workers.displayEmployeeDetails());
    }
}
