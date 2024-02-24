package com.Exceptions.code;

public class Finally {
    public static void main(String[] args) {
        try {
            finallyExplain();
        } catch (Exception e) {
            System.out.println(e);
        }
    }

    public static int finallyExplain() throws Exception {
        try {
            throw new Exception();
        } catch (Exception e) {
            System.out.println(e);
        }
        finally {
            System.out.println("FINAL MESSAGE");
        }

        return 0;


    }

}
