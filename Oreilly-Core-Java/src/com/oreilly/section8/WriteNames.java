package com.oreilly.section8;

import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.ArrayList;

public class WriteNames {
    public static void main(String[] args) {
        ArrayList<String> names=new ArrayList<>();
        names.add("omer");
        names.add("farooq");
        names.add("john");
        names.add("ram");
        names.add("shyam");
        try
        {
            PrintWriter pw = new PrintWriter("/home/syedof/IdeaProjects/core-java/Oreilly Core Java/src/com/oreilly/section8/names.txt");
            for(String name:names)
            {
                pw.println(name);
            }
            pw.close();
        }
        catch (FileNotFoundException e)
        {
            System.out.println(e.getMessage());
        }

    }
}