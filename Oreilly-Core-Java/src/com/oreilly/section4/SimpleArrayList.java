package com.oreilly.section4;

import java.util.ArrayList;

public class SimpleArrayList {
    public static void main(String[] args) {
        ArrayList<String> nameList=new ArrayList<>();
        nameList.add("john");
        nameList.add("jokm");
        nameList.add("jots");
        nameList.add("joer");
        nameList.add("joca");
//        for(int i=0;i<nameList.size();i++)
//        {
//            System.out.println(nameList.get(i));
//        }
        for(String name:nameList)
        {
            System.out.println(name);
        }
    }
}
