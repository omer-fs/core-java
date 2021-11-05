package com.java.assignment3;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        PingTimeMedian ping = new PingTimeMedian();

        System.out.println("Enter ipAddress: ");
        String url = new Scanner(System.in).nextLine();

        System.out.println("Enter count : ");
        int count = new Scanner(System.in).nextInt();

        ping.pingHost(url,count);
    }
}
