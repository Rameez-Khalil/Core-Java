package com.objectorientation.innerclasses.code;

public class OuterClass_03 {

    int x = 10;
    static int y = 20;
    static class InnerClass{
        void innerShow(){
            //Only static vars are allowed.
            System.out.println(y);
        }
    }
}


class MainStaticInner{
    public static void main(String[] args) {
        OuterClass_03.InnerClass i = new OuterClass_03.InnerClass();
        i.innerShow();

    }
}
