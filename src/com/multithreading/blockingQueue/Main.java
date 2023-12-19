package com.multithreading.blockingQueue;

import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;

public class Main {
    public static void main(String[] args) {


        //Shared data structure - this will maintain the capacity itself.
        BlockingQueue<Integer> questionsQueue = new ArrayBlockingQueue<Integer>(5);
        Thread thread1 = new Thread(new Producer(questionsQueue));
        Thread thread2 = new Thread(new Consumer(questionsQueue));

        thread1.start();
        thread2.start();
    }
}
