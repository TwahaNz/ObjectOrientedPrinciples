package com.tnz.app.domain;

/**
 * Created by Admin on 3/27/16.
 */
public class Job {

    private String jobType;
    private float salaryAmount;
    private String companyName;

    public Job(String jobType, float salaryAmount, String companyName) {
        this.jobType = jobType;
        this.salaryAmount = salaryAmount;
        this.companyName = companyName;
    }

    public String getJobType() {
        return jobType;
    }

    public float getSalaryAmount() {
        return salaryAmount;
    }

    public String getCompanyName() {
        return companyName;
    }
}
