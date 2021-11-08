package com.oreilly.section8;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class FileInputFun {
    public static void main(String[] args) {
        Scanner infile;
        try {
            File file=new File("/home/syedof/IdeaProjects/core-java/Oreilly Core Java/src/com/oreilly/section8/input.txt");
            infile=new Scanner(file);
            int sum=0;
            int input;
            while (infile.hasNext())
            {
                input=infile.nextInt();
                sum+=input;
                System.out.println(input);
            }
            System.out.println("sum is "+sum);
            infile.close();
        }
        catch (FileNotFoundException e)
        {
            System.out.println("cant find file");
        }
    }
}
