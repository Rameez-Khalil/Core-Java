package com.SOLID.singleresponsiblity;

import java.util.Date;

public class Employee {
    private String name;
    private int id;

    public Date getDatOfJoining() {
        return datOfJoining;
    }

    private Date datOfJoining;

    public Employee(String name, int id, Date datOfJoining) {
        this.name = name;
        this.id = id;
        this.datOfJoining = new Date();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public static void main(String[] args) {
        Date date = new Date();
        Employee emp = new Employee("rameez", 100, date);


    }
}
