package com.objectorientation.inheritance;

public class Multilevel {
    /*
        When A is giving birth to B, and C
        C will have access to B and A.
        B will have access to A.
     */
    public static void main(String[] args) {
        A aClass = new A();
        B bClass = new B();

        C cClass = new C();


        System.out.println("A class calling");
        aClass.showA();

        System.out.println("B Class calling");
        bClass.showA();
        bClass.showB();

        System.out.println("C class calling");
        cClass.showA();
        cClass.showB();
        cClass.showC();
    }


}


class A{
   void showA(){
       System.out.println("A method");
   }
}


class B extends A{

    void showB(){
        System.out.println("B method");
    }
}

class C extends  B{

    void showC(){
        System.out.println("C method");
    }
}