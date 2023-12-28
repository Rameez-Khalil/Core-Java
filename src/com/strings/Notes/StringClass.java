package com.strings.Notes;

public class StringClass {
    public static void main(String[] args) {
        String x1 = "x1";
        String x2 = x1;
        String x3 = x2;

        x1 = "XX1";
        System.out.println(x1);
        System.out.println(x2);
        System.out.println(x3);
    }
}
