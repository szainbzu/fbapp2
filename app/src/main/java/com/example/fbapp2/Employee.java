package com.example.fbapp2;

public class Employee {
    private String name;

    public Employee(){}

    public Employee(String name, String department) {
        this.name = name;
        this.department = department;
    }

    private String department;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

}
