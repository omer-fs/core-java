package com.java.assignment4;

import java.text.ParseException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws ParseException {
        KycForm kycform = new KycForm();

        // taking input from user
        Scanner input = new Scanner(System.in);
        int t = input.nextInt();
        input.nextLine();
        String s;
        for(int i = 0; i < t; i++){
            s = input.nextLine();

            String[] dates = s.split(" ");

            String regDate = dates[0];
            String currDate = dates[1];

            kycform.dateFormat(regDate, currDate);


        }
    }
}