package com.objectorientation.innerclasses.code;

public class OuterClass_01 {
    int outerVar = 10;
    class InnerClass{
        int innerVar = 100;
        void show(){
            System.out.println("INNER CLASS METHOD");
            System.out.println("Outer Var " + outerVar);
            System.out.println("Inner Var"  + innerVar);
        }
    }

   void outerShow(){
        InnerClass inner = new InnerClass();
       System.out.println("Outer class method");
        System.out.println("Inner Var: " + inner.innerVar);
        System.out.println("Outer Var: " + outerVar);
   }

}


class Main{
    public static void main(String[] args) {
        OuterClass_01 outerObject = new OuterClass_01();
        outerObject.outerShow();
        OuterClass_01.InnerClass innerVar = new OuterClass_01(). new InnerClass();
        innerVar.show();
    }
}
