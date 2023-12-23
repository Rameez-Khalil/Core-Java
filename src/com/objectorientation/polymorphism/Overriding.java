package com.objectorientation.polymorphism;

public class Overriding {
    public void method1(){
        System.out.println("I am overriding method");
    }


}

class Overriding1 extends Overriding{
    @Override
    public void method1(){
        System.out.println("I have changed the implementation");
    }
}
