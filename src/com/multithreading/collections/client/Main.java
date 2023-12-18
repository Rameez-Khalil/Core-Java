package com.multithreading.collections.client;

import com.multithreading.collections.InventoryManager;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        InventoryManager manager = new InventoryManager();

        Thread inventoryTask = new Thread(new Runnable() {
            @Override
            public void run() {
                manager.populateSoldProducts();
            }
        });

        Thread displayTask = new Thread(new Runnable() {
            @Override
            public void run() {
                manager.displaySoldProducts();
            }
        });

        inventoryTask.start();
        Thread.sleep(2000);
//        inventoryTask.join(); //This will make sure that until inventory task hasn't finsihed printing won't execute.

        displayTask.start();
    }
}
