package com.strings.Notes;

import java.util.Random;

public class StringBufferCustom {
    public static void main(String[] args) {

        StringBuffer sb = new StringBuffer();
        Random random = new Random();
        int randomValue = random.nextInt(10);
        for (int i = 0; i <5 ; i++) {
            char ch = (char) (random.nextInt(26) + 'a');
            sb.append(ch);
        }

        System.out.println(sb.toString());

    }
}
