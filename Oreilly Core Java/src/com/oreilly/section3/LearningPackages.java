package com.oreilly.section3;

import java.util.Scanner;

public class LearningPackages {
    public static void main(String[] args) {
        Scanner keyboard=new Scanner(System.in);
        int packageNumber;
        int howManyCourses;
        int baseCost;
        int costPerCourse;
        int numIncluded;
        int totalCost;
        System.out.println("which of the packages do you want?");
        packageNumber=keyboard.nextInt();
        System.out.println("how many courses did you enroll in this month?");
        howManyCourses=keyboard.nextInt();
        if(packageNumber==1)
        {
            baseCost=10;
            costPerCourse=6;
            numIncluded=2;
        }
        else if (packageNumber==2)
        {
            baseCost=12;
            costPerCourse=4;
            numIncluded=4;
        }
        else
        {
            baseCost=15;
            costPerCourse=3;
            numIncluded=6;
        }
        if(howManyCourses>numIncluded)
        {
            totalCost=baseCost+(howManyCourses-numIncluded)*costPerCourse;
        }
        else
        {
            totalCost=baseCost;
        }
        System.out.println("total cost is $"+totalCost);
    }
}
