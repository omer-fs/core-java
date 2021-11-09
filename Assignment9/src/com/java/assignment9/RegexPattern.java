package com.java.assignment9;

import java.util.Scanner;
import java.util.regex.Pattern;

public class RegexPattern {
    public static void main(String[] args) {
        String inputString;
        Scanner in=new Scanner(System.in);
        System.out.println("Enter input string:");
        inputString=in.nextLine();
        if(Pattern.matches("^[A-Z].*(.)$", inputString))
        {
            System.out.println("Yes! Input string begins with capital letter and ends with a period");
        }
        else
        {
            System.out.println("No! Input string does not begin with capital letter or ends with a period");
        }
        in.close();
    }
}
