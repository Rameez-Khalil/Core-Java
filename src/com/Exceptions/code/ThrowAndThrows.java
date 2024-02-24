package com.Exceptions.code;

public class ThrowAndThrows {
    public static void main(String[] args) {
        System.out.println(method1());
    }


    public static int method1() {
        try {
            return method2(-1,0);
        } catch (NegativeException e) {
            System.out.println(e);
        }
        return 0;
    }

    public static int method2(int num1, int num2) throws NegativeException{
        if (num1 < 0 || num2 < 0) {
            throw new NegativeException();

        }
        return num1 * num2;
    }

}

class NegativeException extends Exception{

    @Override
    public String toString(){
        return "Values cannot be negative";
    }
}
