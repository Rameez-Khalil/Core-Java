package com.Exceptions.code;

public class Exceptions {
    public static void main(String[] args) {


//        Example # 1 (MULTIPLE CATCH BLOCKS).
        //Only corresponding catch block will be executed and the order is sequential.

        try {
            int[] array1 = {10, 0, 10, 40};
            int ratio = array1[0] / array1[2];
            System.out.println("RATIO: " + ratio);
            System.out.println(array1[10]);
        } catch (ArithmeticException e) {
            e.printStackTrace();
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println(e);
        }

//        Example# 2 (Nested Try block).
        try{
            int[] array = {10,20,30,40,0};

            try{
                //This will have its own exception.
                int ratio = array[0]/array[array.length-1];
            }
            catch (ArithmeticException e){
                System.out.println(e) ;
            }
            System.out.println(array[array.length+1]);

        }
        catch (ArrayIndexOutOfBoundsException e){
            System.out.println(e);
        }


    }
}
