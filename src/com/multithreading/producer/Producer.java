package com.multithreading.producer;

import java.util.List;

public class Producer implements Runnable {

    List<Integer> questionsList = null;
    final int LIMIT = 5;
    private int questions;

    public Producer(List<Integer> questionsList) {
        this.questionsList = questionsList;
    }

    public void readQuestion(int questions) throws InterruptedException {
        //Since questionsList is a shared resource
        synchronized (questionsList) {
            while (questionsList.size() == LIMIT) {
                System.out.println("Questions have pile up");
                questionsList.wait();
            }
        }
        synchronized (questionsList) {
            System.out.println("New Question: " + questions);
            questionsList.add(questions);
            Thread.sleep(100);
            questionsList.notify();
        }

    }


    @Override
    public void run() {
        while (true) {
            try {
                readQuestion(questions++);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }

        }


    }

}
