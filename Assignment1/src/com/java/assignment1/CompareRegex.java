package com.java.assignment1;

import java.io.File;

public class CompareRegex {
    public void checkRegex(File file, String reg){
        // endsWith method is used for implementing regular expression which is file method
        String name = file.getName();

        if (name.endsWith(reg)) {
            System.out.println(file.getAbsolutePath());
        }
    }
}