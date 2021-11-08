package com.oreilly.section8;

import java.io.FileNotFoundException;
import java.io.PrintWriter;


public class FileOutputFun {
    public static void main(String[] args) {
        try {
            PrintWriter pw=new PrintWriter("/home/syedof/IdeaProjects/core-java/Oreilly Core Java/src/com/oreilly/section8/input.txt");
            pw.println("Hello");
            pw.println("my name is john baugh");
            pw.close();
        }
        catch (FileNotFoundException e)
        {
            System.out.println(e.getMessage());
        }
    }
}
