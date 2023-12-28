package com.strings.Notes;

public class StringBuilderCustom {
    public static void main(String[] args) {
       //Two Pointers.
        StringBuilder sb = new StringBuilder("rameez");
        for(int i=0;i<sb.length()/2;i++){
            int front = i;
            int back = sb.length()-i-1;

            char frontChar = sb.charAt(front);
            char backChar = sb.charAt(back);

            sb.setCharAt(front, backChar);
            sb.setCharAt(back,frontChar);
        }

        System.out.println(sb);

    }

}
