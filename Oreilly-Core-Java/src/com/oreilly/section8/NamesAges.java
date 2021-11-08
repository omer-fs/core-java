package com.oreilly.section8;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

public class NamesAges {
    public static void main(String[] args) {
        Scanner namesFile;
        Scanner agesFile;
        PrintWriter pw;
        try {
            namesFile=new Scanner(new File("student_names.txt"));
            agesFile=new Scanner(new File("student_ages.txt"));
            pw=new PrintWriter("/home/syedof/IdeaProjects/core-java/Oreilly Core Java/src/com/oreilly/section8/names_ages.txt");
            String tempName;
            int tempAge;
            while(namesFile.hasNext())
            {
                tempName=namesFile.nextLine();
                tempAge=agesFile.nextInt();
                pw.println(tempName+" is "+tempAge+" years old.");
            }
            namesFile.close();
            agesFile.close();
            pw.close();
        }
        catch (FileNotFoundException e)
        {
            System.out.println(e.getMessage());
        }
    }
}