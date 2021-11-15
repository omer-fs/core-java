package com.java.assignment1;

import java.io.BufferedReader;
import java.io.File;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {

        SearchFile fs = new SearchFile();
        
        File folder = new File("/home/syedof");

        // Taking input for regular expression
        BufferedReader bufferreader = new BufferedReader(new InputStreamReader(System.in));
        String reg = bufferreader.readLine();

        while(!reg.equals("")) {
            fs.iterateDirectory(folder, reg);
            reg = bufferreader.readLine();
        }

    }
}