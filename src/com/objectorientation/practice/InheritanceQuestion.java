package com.objectorientation.practice;

public class InheritanceQuestion {
    public static void main(String[] args) {
        A objectVar = new C();
        objectVar.m1();
        System.out.println(objectVar.x);
    }
}


class A{
    int x = 100;
    void m1(){
        System.out.println("M1 under A");
    }
}

class B extends A{
    void m1(){
        System.out.println("M1 under B");
    }
}

class C extends A{

    int x = 200;
    void m1(){
        System.out.println("M1 under C");
    }
}

