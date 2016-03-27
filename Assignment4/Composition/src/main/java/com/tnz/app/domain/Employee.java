package com.tnz.app.domain;

/**
 * Created by Admin on 3/27/16.
 */
public class Employee {

    private String name;
    private int id;
    private Job jobInformation;

    public Employee(String name, int id, Job jobInformation) {
        this.name = name;
        this.id = id;
        this.jobInformation = jobInformation;
    }

    public String getName() {
        return name;
    }

    public int getId() {
        return id;
    }

    public Job getJobInformation() {
        return jobInformation;
    }

    public String displayEmployeeDetails(){
        return "Name: " + name + " ID: " + id + "\n Role: " + jobInformation.getJobType() +
                "\n Company: " + jobInformation.getCompanyName() + "\n Salary: " + jobInformation.getSalaryAmount();
    }
}
