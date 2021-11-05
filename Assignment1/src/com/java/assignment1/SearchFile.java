package com.java.assignment1;

import java.io.File;

public class SearchFile {

    CompareRegex compareRegex = new CompareRegex();

    public void iterateDirectory(File file, String reg){
        if(file.isDirectory()){
            File[] files = file.listFiles();
            assert files != null;
            for (File f : files) {
                iterateDirectory(f, reg);
            }
        }
        else {
            compareRegex.checkRegex(file, reg);
        }
    }
}

