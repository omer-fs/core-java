package com.oreilly.section2;

public class RelationalOperators {
    public static void main(String[] args) {
        String myName = "john";
        String yourName = "john";
        boolean myBoolean = true;
        boolean yourBoolean= false;
        int myAge = 27;
        int yourAge = 35;
        int bobAge = 26;
        System.out.println("mybool is : "+myBoolean);
        System.out.println("yourbool is : "+yourBoolean);
        int currentAge = 20;

        boolean ageComparision = myAge>yourAge;
        System.out.println("myAge>yourAge ? : "+ageComparision);

        ageComparision=yourAge>bobAge;
        System.out.println("yourAge>bobAge ? : "+ageComparision);

        ageComparision=yourAge==bobAge;
        System.out.println("yourAge==bobAge ? : "+ageComparision);

        boolean nameComparision = myName.equals(yourName);
        System.out.println("myName == yourName ? : "+nameComparision);

        boolean isGreater21 = currentAge>=21;
        System.out.println("cuurentAge>21 ? : "+isGreater21);

    }
}
