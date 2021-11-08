package com.java.assignment11;

//import org.jetbrains.annotations.NotNull;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.HashMap;
import java.util.Scanner;

public class CharacterCount {
    public static void main(String args[]) throws FileNotFoundException {
        HashMap<Character,Integer> countCharacters=new HashMap<>();
        //System.out.println(args[0]);
        //File inputFile = new File(args[0]);
        Scanner keyboard=new Scanner(new File(args[0]));
        while(keyboard.hasNext())
        {
            for(char c:keyboard.nextLine().toCharArray())
            {
                if (countCharacters.containsKey(c))
                {
                    countCharacters.put(c,countCharacters.get(c)+1);
                }
                else
                {
                    countCharacters.put(c,1);
                }
            }
        }
        System.out.println("printed output to file named OutputText.txt");
        PrintWriter pw=new PrintWriter("/home/syedof/IdeaProjects/Assignment11/src/com/java/assignment11/OutputText.txt");
        pw.println("Character        Count");
        for(Character c:countCharacters.keySet())
        {
            pw.println(c+"        "+countCharacters.get(c));
        }
        pw.close();
    }
}