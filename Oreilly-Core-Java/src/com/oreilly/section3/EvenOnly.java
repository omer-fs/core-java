package com.oreilly.section3;

public class EvenOnly {
    public static void main(String[] args) {
        int count=0;
        while(count<10)
        {
            if(count%2!=0)
            {
                count++;
                continue;
            }
            System.out.println(count);
            count++;
        }
    }
}
