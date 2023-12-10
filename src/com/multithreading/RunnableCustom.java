package com.multithreading;

public class RunnableCustom {
    public static void main(String[] args) {

        System.out.println("Hello1");
        RunnableExample re = new RunnableExample("TA");
        RunnableExample re1 = new RunnableExample("TB");

        System.out.println("Thread1 ");
        re.start();
        System.out.println("THread2:  ");
        re1.start();

    }
}


class RunnableExample extends Thread{
    String name;
    RunnableExample(String name){
        this.name = name;
    }
    @Override
    public void run(){
        Thread.currentThread().setName(name);
        for(int i=0;i<100;i++){
            System.out.println(i);
            try {
                Thread.sleep(10);
                System.out.println("I am in try" + Thread.currentThread().getName());
            } catch (InterruptedException e) {
               e.printStackTrace();
            }
        }
    }
}
