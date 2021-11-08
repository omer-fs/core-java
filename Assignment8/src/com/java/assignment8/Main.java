package com.java.assignment8;

public class Main {
    public static void checkVariable(String var) throws EndWithDollar, EndWithInt, EndWithUnderscore{
        try{
            System.out.println(var);
            if(var.endsWith("$"))
                throw new EndWithDollar("variable shouldn't end with dollar");
            else if(var.endsWith("_"))
                throw new EndWithUnderscore("variable shouldn't end with underscore");
            else if(Character.isDigit(var.charAt(var.length()-1)))
                throw new EndWithInt("variable shouldn't end with a number");
        }
        catch(NullPointerException e){
            System.out.println("variable cannot be null");
        }
        finally {
            System.out.println("Finally Block");
        }
    }

    public static void main(String[] args) throws EndWithUnderscore, EndWithInt, EndWithDollar {
        String[] str = {"abc_", "abc1", "abc$", null};
        for(String s: str){
            checkVariable(s);
        }

    }
}
