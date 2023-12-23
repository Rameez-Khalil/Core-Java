package com.objectorientation.interfaces;

interface Interface {
    void run();
}

class Car implements Interface{

    @Override
    public void run(){
        System.out.println("Car is starting");
    }
}