package com.SOLID.DI;

public class Chef {

    public Food food;

   //DEPENDENCY INJECTION.
    Chef(Food food){
        this.food = food;
    }


}
