package com.objectorientation.encapsulation;

public class Main {
    public static void main(String[] args) {
        Employee emp = new Employee();
        int id = emp.getId();
        String name = emp.getName();

        emp.setId(12);
        emp.setName("Rameez");

        System.out.println(emp.getId() + emp.getName());



    }
}
