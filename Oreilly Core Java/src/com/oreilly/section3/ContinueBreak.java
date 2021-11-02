package com.oreilly.section3;

public class ContinueBreak {
    public static void main(String[] args) {
        int count=0;
        while (count<10)
        {
            if(count==5) {
                count++;
                break;
            }
            System.out.println(count+" \t");
            count++;
        }
    }
}
