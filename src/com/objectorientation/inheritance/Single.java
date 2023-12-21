package com.objectorientation.inheritance;

public class Single {
    public static void main(String[] args) {
        Dog dog = new Dog("Edgar");
        dog.getName();

    }
}


class Animal{
    String name;

    public Animal(String name) {
        this.name = name;
    }
    public void getName(){
        System.out.println("Animal: " + name);
    }
}

class Dog extends  Animal{
    public Dog(String name) {
        super(name);
    }

    public void getName(){
        System.out.println("Dog: " + name);
    }
}