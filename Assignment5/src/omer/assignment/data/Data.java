package omer.assignment.data;

public class Data {
    int var1; char var2;

    public void display(){
        System.out.println("var 1 : "+var1+"\tvar 2 : "+var2);
    }

    public void displayLocal(){
        int var1; char var2;
        System.out.println("var 1 : "+var1+" var 2 : "+var2);  //error
        /*
        In java local variables do not have default values like global variables, hence local variables must be
        initialized before using
         */
    }
}
