package com.objectorientation.inheritance;

public class Hierarchical {

    /*
        B can call A as it extends A.
        C can call A as it extends A.
     */

    public static void main(String[] args) {
        A1 a1 = new A1();
        B1 b1 = new B1();
        C1 c1 = new C1();

        a1.showA1();


        System.out.println("B calling: ");
        b1.showB1();
        b1.showA1();

        System.out.println("C Calling");
        c1.showC1();
        c1.showA1();
    }
}


class A1{
    void showA1(){
        System.out.println("A1");
    }
}

class B1 extends A1{
    void showB1(){
        System.out.println("B1");
    }
}

class C1 extends  A1{
    void showC1(){
        System.out.println("C1");
    }
}