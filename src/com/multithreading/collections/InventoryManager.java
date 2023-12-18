package com.multithreading.collections;

import java.util.*;
import java.util.concurrent.CopyOnWriteArrayList;

public class InventoryManager {
    List<Product> soldProductsList = new CopyOnWriteArrayList<>();
    List<Product> purchasedProductList = new ArrayList<Product>();

    public void populateSoldProducts(){
        for(int i=0;i<1000;i++){
            Product prod = new Product(i, "tet_product_"+i);
            soldProductsList.add(prod);
            System.out.println("Added: " + prod);
            try {
                Thread.sleep(10);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }

    public void displaySoldProducts(){
        for(Product product: soldProductsList){
            System.out.println("SOLD: "+ product);
            try {
                Thread.sleep(10);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }

}
