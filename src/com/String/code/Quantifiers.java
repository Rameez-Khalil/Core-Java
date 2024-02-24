package com.String.code;

public class Quantifiers {
    public static void main(String[] args) {

//         * : No. of times.

        String str = "abc";
        System.out.println(str.matches("[a-b]*"));

//        + : 0 or more.
        String strPlus = "abbbbbbbbbb";
        System.out.println(strPlus.matches("[a-b]{3,7}"));

//        Validate gmail address.
        String email = "rameezkhalil23@gmail.com";
        System.out.println(email.matches(".*@gmail(.*)"));

    }
}
