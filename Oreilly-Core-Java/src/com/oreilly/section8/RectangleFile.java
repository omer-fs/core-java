package com.oreilly.section8;

import com.oreilly.section7.Rectangle;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class RectangleFile {
    public static void main(String[] args) {
        ArrayList<Rectangle> rectangleList;
        rectangleList=new ArrayList<Rectangle>();
        fillArrayList(rectangleList);
        printRectangles(rectangleList);
    }
    public static void fillArrayList(ArrayList<Rectangle> rectangleAL)
    {
        Scanner infile;
        try {
            infile=new Scanner(new File("/home/syedof/IdeaProjects/core-java/Oreilly Core Java/src/com/oreilly/section8/rectangle_data.txt"));
            Rectangle temp;
            double length;
            double width;
            while (infile.hasNext())
            {
                length=infile.nextDouble();
                width=infile.nextDouble();
                temp=new Rectangle(length,width);
                rectangleAL.add(temp);
            }

            infile.close();
        }
        catch (FileNotFoundException e)
        {
            System.out.println(e.getMessage());
        }
    }
    public static void printRectangles(ArrayList<Rectangle> rectangleAL)
    {
        for(Rectangle r:rectangleAL)
        {
            System.out.println("length : "+r.getLength());
            System.out.println("width : "+r.getWidth());
            System.out.println("area : "+r.area());
            System.out.println("perimeter : "+r.perimeter());
            System.out.println();
        }
    }
}