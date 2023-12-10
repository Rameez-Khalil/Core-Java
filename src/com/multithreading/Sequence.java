package com.multithreading;

public class Sequence {
    private int value = 0;

    //This class is going to maintain numeric sequence.
    public int getNext() {
        value++;
        return value;
    }
}


class Worker extends Thread{

    Sequence sq = null;
    Worker(Sequence seq){
        this.sq = seq;
    }

    @Override
    public void run(){
        for(int i=0;i<100;i++){
            System.out.println();
        }
    }

}