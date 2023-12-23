package com.objectorientation.polymorphism;

public class PolymorphismRunner {
    public static void main(String[] args) {

//        ****OVERLOADING
//        Overloading overloading = new Overloading();
//        overloading.method1();
//        overloading.method1("Rameez1", 30);

        Overriding overriding = new Overriding();
        Overriding1 overriding1 = new Overriding1();

        overriding1.method1();
        overriding.method1();

    }
}
