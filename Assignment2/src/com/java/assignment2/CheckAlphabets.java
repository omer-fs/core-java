package com.java.assignment2;

public class CheckAlphabets {
    public static boolean check(String str){
        int i=0;
        boolean[] boolList=new boolean[26];
        for(int j=0;j<str.length();j++)
        {
            if('a'<=str.charAt(j) && str.charAt(j)<='z')
                i=str.charAt(j)-'a';
            else if('A'<=str.charAt(j) && str.charAt(j)<='Z')
                i=str.charAt(j)-'A';
            boolList[i]=true;
        }
        for(int j=0;j<26;j++){
            if(!boolList[j])
                return false;
        }
        return true;
    }
}

// Time Complexity: O(n)    where n is length of the string
// Space Complexity: O(26)