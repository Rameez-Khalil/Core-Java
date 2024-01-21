package com.SOLID.DI;

public class Burger implements Food{
    public String name;

    @Override
    public void foodName(){
        System.out.println("Name: " + name);
    }


}
