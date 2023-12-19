package com.multithreading.blockingQueue;

import java.util.concurrent.BlockingQueue;

public class Consumer implements Runnable {
    BlockingQueue<Integer> questionsQueue;

    public Consumer(BlockingQueue<Integer> questionsQueue) {
        this.questionsQueue = questionsQueue;

    }

    @Override
    public void run() {
        while (true) {
            try {
                System.out.println("ANSWERED: " + questionsQueue.take());
                Thread.sleep(200);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }


        }

    }
}
