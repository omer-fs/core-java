package omer.assignment.singleton;

public class Singleton {
    String str;

    public static Singleton setStr(String str){

        this.str = str;  //error
        /*
        non-static variables cannot be referred from a static context i.e static method.
        Static methods are loaded when a class is loaded whereas instance variables are
        instantiated when an object is created, hence we cannot access instance variables
        in static methods directly, but can be accessed through an object.
         */

        return new Singleton();
    }
    public void display(){
        System.out.println(str);
    }
}