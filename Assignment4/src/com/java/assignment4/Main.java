package com.java.assignment4;

import java.text.ParseException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws ParseException {
        KycForm kf = new KycForm();

        // taking input from user
        Scanner ob = new Scanner(System.in);
        int t = ob.nextInt();
        ob.nextLine();
        String s;
        for(int i = 0; i < t; i++){
            s = ob.nextLine();

            String[] dates = s.split(" ");

            String regDate = dates[0];
            String currDate = dates[1];

            kf.dateFormat(regDate, currDate);


        }
    }
}