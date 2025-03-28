package com.bridgelabz.resumescreener;

// Generic class to process and maintain resume
class Resume<T extends JobRole> {
    // Attribute
    private String name;
    private T jobRole;

    // Constructor
    Resume(String name, T jobRole) {
        this.name = name;
        this.jobRole = jobRole;
    }

    // getter method for job role and name
    public T getJobRole() {
        return jobRole;
    }

    public String getName() {
        return name;
    }

    // method to get job role details
    public void displayJobDetails() {
        System.out.println("Name: " + name);
        jobRole.getRoleDetails();
    }
}
