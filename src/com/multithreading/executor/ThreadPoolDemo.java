package com.multithreading.executor;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

public class ThreadPoolDemo {
    public static void main(String[] args) {
        ///Executor service manages the thread pool.
        ExecutorService executor = Executors.newFixedThreadPool(2); /// recycles the thread.        //Submitting tasks to this pool.
        Runnable processor = new MessageProcessor(1);
        executor.execute(processor);
        Runnable processor2 = new MessageProcessor(2);
        executor.execute(processor2);
        Runnable processor3 = new MessageProcessor(3);
        executor.execute(processor3);
        executor.shutdown();

//        executor.shutdownNow(); //immediately turns off, doesn't wait for the tasks
        try {
            executor.awaitTermination(2, TimeUnit.SECONDS);
            System.out.println("I a await");
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        while(!executor.isTerminated()){

        }

        System.out.println("Submitted all");


    }
}
