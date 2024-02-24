package com.String.code;

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

    }
}
