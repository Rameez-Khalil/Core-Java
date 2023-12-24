package com.objectorientation.keywords;

public class StaticBlock {
    public static void main(String[] args) {
        System.out.println("Hello from main method");
    }

    static{
        System.out.println("I am a static block1");
    }
    static{
        System.out.println("I am a static block2");
    }
}
