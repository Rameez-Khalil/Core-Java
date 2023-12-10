package com.multithreading;

public class Main {
    //Starting a thread
    public static void main(String[] args) {
        Task taskRunner1 = new Task();
        taskRunner1.start(); //Control didn't stop here, it moved on!
        System.out.println("Hello there");

        Task taskRunner2 = new Task();
        taskRunner2.start();


    }
}


//Defining another class.
class Task extends Thread {
    /*
        Thread is a task that needs to perform some steps.
     */

    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
            System.out.println("number: " + i);
        }
    }


}