package com.String.code;

import java.util.Arrays;

public class StringChallenge {
    public static void main(String[] args) {

        //Find if the provided email address belongs to gmail.
        String str = "rameezkhalil@gmail.com";
        System.out.println(str.matches(".*@gmail(.*)"));

        //Find the username and domain name from the given email.
        String username = str.substring(0,str.indexOf("@"));
        String domainName = str.substring(str.indexOf("@")+1,str.indexOf("."));
        System.out.println("Username : " + username);
        System.out.println("Domain Name : " + domainName);


//        Find if the number is binary.
        int binary = 10110001;
        String stringRepresentation = String.valueOf(binary);
        System.out.println("BINARY NUMBER");
        System.out.println(stringRepresentation.matches("[01]*"));


//        Find if the number is hexadecimal.
        String hexNumber = "234A";
        System.out.println(hexNumber.matches("[0-9A-F]+"));


//        Write regular expressions for date and time.
        String dateTime = "01/01/200";
        System.out.println(dateTime.matches("[0-1][0-9]/[01][0-9]/[0-9]{4}"));


//        Remove special characters.
        String specialCharacters = "abcd@!";
        String newString = specialCharacters.replaceAll("[^a-zA-Z0-9]", "");
        System.out.println(newString);

//        Remove extra spaces.
        String extraSpace = "acd  ";
        System.out.println(extraSpace.replaceAll("\\s", ""));

//        Find number of words.
        String numberOfWords = "rameez is the greatest";
        String[] strArray = numberOfWords.split("\\s");
        System.out.println(strArray.length);


    }
}
