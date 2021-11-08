package com.oreilly.section5;

public class StringMethods1 {
    public static void main(String[] args) {
        String name="john baugh";
        String name2="john baugh";
        String name3="rob perceval";
        String challengeName="ed mortram";

        for(int i=0;i<name.length();i++)
        {
            System.out.print(name.charAt(i));
        }
        System.out.println();
        if (name.equals(name2))
        {
            System.out.println("names are equal");
        }
        else
        {
            System.out.println("names are not equal");
        }
        if(name.compareTo(name3)>0)
        {
            System.out.println("name > name3");
        }
        else
        {
            System.out.println("name <= name3");
        }
        System.out.println("comparing for the lecture challenge");
        if(challengeName.compareTo(name)>0)
        {
            System.out.println(challengeName+" is greater than "+name);
        }
        else
        {
            System.out.println(challengeName+" is less than or equal to "+name);
        }
    }
}
