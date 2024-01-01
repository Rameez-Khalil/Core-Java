package com.objectorientation.singleton;

public class CoffeeMachine {
    private int waterQuantity = 1;
    private int milkQuantity = 1;

    static private CoffeeMachine referenceVar = null;
    static int objectCount = 0;

    private CoffeeMachine(int waterQuantity, int milkQuantity) {
        this.waterQuantity = waterQuantity;
        this.milkQuantity = milkQuantity;
        objectCount++;
    }

    static CoffeeMachine getInstance(){
        if(objectCount==0){
            return referenceVar = new CoffeeMachine(5,5);
        }

        return null;
    }

    void show(){
        System.out.println(waterQuantity + " " + milkQuantity);
    }

}

class Main{
    public static void main(String[] args) {
        CoffeeMachine var = CoffeeMachine.getInstance();
        var.show();

    }
}
