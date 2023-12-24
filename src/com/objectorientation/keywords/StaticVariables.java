package com.objectorientation.keywords;

public class StaticVariables {
    public static void main(String[] args) {
        Employee emp = new Employee("Rameez", 1326);
        Employee emp1 = new Employee("Sarmad", 1327);
        emp.show();


    }
}


class Test {
    static int a = 20;

    void show() {
        System.out.println("Class variable: ");
        System.out.println(a);
//        static int x = 100;  --
//        Static vars aren't allowed in local scope.
//        static var means only one single copy will be shared among instances.

    }
}


class Employee {
    String name;
    int id;
    static String companyName = "Systems Limited";
    static int employeeCount = 0;

    public Employee(String name, int id) {
        this.name = name;
        this.id = id;
        employeeCount++;
    }

    void show(){
        System.out.println(name + " " + id + companyName);
        System.out.println("Total Employee Count: " + employeeCount);
    }

}