package com.multithreading;

public class SequenceMain {
    public static void main(String[] args) {
        Sequence sq = new Sequence();
        for(int i=0;i<100;i++){
            System.out.println(sq.getNext());
        }
    }
}
