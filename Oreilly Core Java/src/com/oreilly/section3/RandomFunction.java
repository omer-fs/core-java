package com.oreilly.section3;

import java.util.Random;

public class RandomFunction {
    public static void main(String[] args) {
        Random random=new Random();
        int myRandomNumber;
        myRandomNumber=random.nextInt();
        System.out.println("my random number is : \t"+myRandomNumber);
        myRandomNumber=random.nextInt(1000); // 0 to 999
        System.out.println("0 through 999 random number is : \t"+myRandomNumber);
        myRandomNumber=random.nextInt(1000)+1;// 1 to 999
        System.out.println("1 through 999 random number is : \t"+myRandomNumber);
    }
}
