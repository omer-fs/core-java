package com.oreilly.section2;

import java.util.Scanner;

public class MadLibsClone {
    public static void main(String[] args) {
        Scanner keyboard =new Scanner(System.in);
        String adjective1;
        String girlsName;
        String adjective2;
        String occupation1;
        String placeName;
        String clothing;
        String hobby;
        String occupation2;
        String boysName;
        String mansName;
        String adjective3;

        System.out.println("Enter an adjective : ");
        adjective1=keyboard.nextLine();
        System.out.println("Enter girlsname : ");
        girlsName=keyboard.nextLine();
        System.out.println("Enter an adjective2 : ");
        adjective2=keyboard.nextLine();
        System.out.println("Enter an occupation : ");
        occupation1=keyboard.nextLine();
        System.out.println("Enter name of place : ");
        placeName=keyboard.nextLine();
        System.out.println("Enter name of piece of clothing : ");
        clothing=keyboard.nextLine();
        System.out.println("Enter name of hobby : ");
        hobby=keyboard.nextLine();
        System.out.println("Enter another adjective : ");
        adjective3=keyboard.nextLine();
        System.out.println("Enter another occupation : ");
        occupation2=keyboard.nextLine();
        System.out.println("Enter boys name : ");
        boysName=keyboard.nextLine();
        System.out.println("Enter mans name : ");
        mansName=keyboard.nextLine();

        System.out.println("There once was a "+adjective1+" girl named "+girlsName+" who was a "+adjective2+" "+occupation1+" in the kingdom of "+placeName+".");
        System.out.println("she loved to wear "+clothing+" and to "+hobby+". She wanted to marry "+adjective2+" "+occupation2+" named "+boysName+" but her father, king "+mansName+" forbid her from seeing him.");
    }
}