package com.objectorientation.innerclasses.code;

public class OuterClass_02 {

    public static void show(){
        AbstractClass abs = new AbstractClass() {
            @Override
            void showAbstract() {
                System.out.println("I've been overridden");
            }
        };

        abs.showAbstract();
    }

}


abstract class AbstractClass {
    abstract void showAbstract();

}

class MainInner{
    public static void main(String[] args) {
        OuterClass_02.show();
    }
}