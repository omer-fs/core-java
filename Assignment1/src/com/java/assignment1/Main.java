package com.java.assignment1;

import java.io.BufferedReader;
import java.io.File;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {

        SearchFile fileSearch = new SearchFile();
        
        File folder = new File("/home/syedof");

        // Taking input for regular expression
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String reg = br.readLine();

        while(!reg.equals("")) {
            fileSearch.iterateDirectory(folder, reg);
            reg = br.readLine();
        }

    }
}