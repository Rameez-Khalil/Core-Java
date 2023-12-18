package com.multithreading.producer;

import java.util.List;

public class Consumer implements Runnable {

    List<Integer> questionsList = null;
    private int questions;

    public Consumer(List<Integer> questionsList) {
        this.questionsList = questionsList;
    }

    public void answeringQuestions() throws InterruptedException {
        //Since questionsList is a shared resource
        synchronized (questionsList) {
            while (questionsList.isEmpty()) {
                System.out.println("No Questions answered");
                questionsList.wait();
            }
        }
        synchronized (questionsList) {
            Thread.sleep(5000);
            System.out.println("Answered Question " + questionsList.remove(0));
            questionsList.notify();
        }

    }


    @Override
    public void run() {
        while (true) {
            try {
                answeringQuestions();
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }

        }


    }

}
