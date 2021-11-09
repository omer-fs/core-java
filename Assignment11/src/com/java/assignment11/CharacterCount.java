package com.java.assignment11;

//import org.jetbrains.annotations.NotNull;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.HashMap;
import java.util.Scanner;

public class CharacterCount {
    public static void main(String args[]) throws FileNotFoundException {
        HashMap<Character,Integer> characterCount=new HashMap<>();

        Scanner keyboard=new Scanner(new File(args[0]));
        while(keyboard.hasNext()) {
            for(char c:keyboard.nextLine().toCharArray()) {
                if (characterCount.containsKey(c)) {
                    characterCount.put(c,characterCount.get(c)+1);
                }
                else {
                    characterCount.put(c,1);
                }
            }
        }
        System.out.println("Output is printed to file OutputText.txt");
        PrintWriter p=new PrintWriter("/home/syedof/IdeaProjects/Assignment11/src/com/java/assignment11/OutputText.txt");
        p.println("Character+++++++++++++++Count");
        for(Character c:characterCount.keySet())
        {
            p.println(c+"          "+characterCount.get(c));
        }
        p.close();
    }
}