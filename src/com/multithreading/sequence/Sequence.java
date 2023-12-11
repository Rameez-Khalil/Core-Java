package com.multithreading.sequence;

public class Sequence {
    private int value = 0;

    //This class is going to maintain numeric sequence.
//    public int getNext() {
////        synchronized (this) {
////            value = value + 1;
////            return value;
////        }
//
//
//    }
    public synchronized int getNext(){
        value = value+1;
        return value;
    }
}


class Worker extends Thread {

    Sequence sq = null;

    Worker(Sequence seq) {
        this.sq = seq;
    }

    @Override
    public void run() {
        for (int i = 0; i < 100; i++) {
            System.out.println(
                    sq.getNext() + "-" + Thread.currentThread().getName()
            );
            try {
                Thread.sleep(500);
            } catch (Exception e) {
                e.printStackTrace();
            }

        }
    }

}