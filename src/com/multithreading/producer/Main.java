package com.multithreading.producer;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<Integer>();
        Thread t1 = new Thread(new Producer(list));
        Thread t2 = new Thread(new Consumer(list));

        t1.start();
        t2.start();



    }
}
