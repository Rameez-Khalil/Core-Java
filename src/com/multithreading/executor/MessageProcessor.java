package com.multithreading.executor;

public class MessageProcessor implements Runnable{
    private int message;

    public MessageProcessor(int message) {
        this.message = message;
    }

    @Override
    public void run(){
        System.out.println(Thread.currentThread().getName() + "RECEIVED MESSAGE: " + message);
        respondToMessage(); //make the thread sleep to simulate to do some work.
        System.out.println(Thread.currentThread().getName() + "DONE-"+message);
    }

    private void respondToMessage() {
        try {
            Thread.sleep(300);
        } catch (InterruptedException e) {
            System.out.println("Error");
        }
    }

}
