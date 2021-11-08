package com.oreilly.section2;

public class ArithmeticOperators {
    public static void main(String[] args) {
        int a=10;
        int b=3;
        //binary
        int result=a+b;
        int difference =a-b;
        int product = a*b;
        int quotient = a/b;
        int remainder =a%b;

        System.out.println("result : "+result);
        System.out.println("diff is : "+difference);
        System.out.println("product is : "+product);
        System.out.println("quotient is : "+quotient);
        System.out.println("remainder is : "+remainder);

        result+=28;
        System.out.println("result now is : "+result);
        //unary operators
        result++;
        System.out.println("result now is : "+result);

        result--;
        System.out.println("result now is : "+result);

        product*=2;
        System.out.println("product now is : "+product);
    }
}
