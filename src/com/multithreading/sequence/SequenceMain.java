package com.multithreading.sequence;

public class SequenceMain {
    public static void main(String[] args) {
        Sequence sequence = new Sequence();
        Worker w1 = new Worker(sequence);
        Worker w2 = new Worker(sequence);

        w1.start();
        w2.start();
    }
}
