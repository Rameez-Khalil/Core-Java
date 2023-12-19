package com.multithreading.blockingQueue;

import java.util.concurrent.BlockingQueue;

public class Producer implements Runnable {
    int questionNumber;
    BlockingQueue<Integer> questionsQueue;

    public Producer(BlockingQueue<Integer> questionsQueue) {
        this.questionsQueue = questionsQueue;

    }

    @Override
    public void run() {

        //This should be an atomic process as BTS this is a 3 step.
        //Since we have only one producer thread then it's not a problem.

        while (true) {
            try {
                synchronized (this) {
                    int nextQuestion = questionNumber++;
                    System.out.println("Got a new question: " + nextQuestion);
                    questionsQueue.put(nextQuestion);
                    Thread.sleep(200);

                }

            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }

}


