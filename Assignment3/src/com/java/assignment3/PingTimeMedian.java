package com.java.assignment3;

import java.net.InetAddress;
import java.util.Arrays;
import java.util.GregorianCalendar;

public class PingTimeMedian {
    public static void pingHost(String url, int count) {

        long arr[] = new long[count];


        try {
            InetAddress inet = InetAddress.getByName(url);

            long start, end;

            while(count>0) {
                start = System.nanoTime();
                //start = new GregorianCalendar().getTimeInMillis();
                if (inet.isReachable(5000)) {
                    end = System.nanoTime();
                    //end = new GregorianCalendar().getTimeInMillis();

                    System.out.println("start "+start+" end "+end);
                    arr[--count] = end-start;


                } else {
                    System.out.println("Host is not reachable");
                    break;
                }
            }

        } catch (Exception e) {
            System.out.println(e);
        }
        Arrays.sort(arr);
        long median = arr[(int)(arr.length/2)];
        System.out.println("\nMedian time in ns is : "+median);


    }
}
