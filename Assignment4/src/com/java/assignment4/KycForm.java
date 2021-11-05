package com.java.assignment4;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class KycForm {

    private Date regDate;
    private Date currDate;

    private void printRange(Date beforeDate, Date afterDate, Calendar cal, int currYear){

        String res;
        String res1;
        SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-yyyy");

        Calendar beforeDateCal = Calendar.getInstance();
        Calendar regDateCal = Calendar.getInstance();

        beforeDateCal.setTime(beforeDate);
        regDateCal.setTime(regDate);

        int beforeDateYear = beforeDateCal.get(Calendar.YEAR);
        int regDateYear = regDateCal.get(Calendar.YEAR);


        // this condition is for when current date is falling before 30 days before registration date anniversary.
        if(currDate.before(beforeDate) || currDate.equals(beforeDate)){
            if(regDateYear == (beforeDateYear - 1) || regDateYear == currYear){
                System.out.println("No Range");
                return;
            }
            cal.set(Calendar.YEAR, currYear - 1);
            res = sdf.format(beforeDate);
            res1 = sdf.format(afterDate);
            System.out.println(res + " " + res1);
        }

        // this condition if for when current date is falling after registration but before 30 days after
        // registration date anniversary.
        else if(currDate.before(afterDate)){
            res = sdf.format(beforeDate);
            res1 = sdf.format(currDate);
            System.out.println(res + " " + res1);
        }

        // this is for when current date is falling after 30 days of registration day anniversary.
        else{
            res = sdf.format(beforeDate);
            res1 = sdf.format(afterDate);
            System.out.println(res + " " + res1);
        }

    }


    public void dateFormat(String rd, String cd) throws ParseException {

        SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-yyyy");
        Calendar cal = Calendar.getInstance();
        Calendar cal1 = Calendar.getInstance();

        cal.setTime(sdf.parse(rd));
        this.regDate = cal.getTime();

        cal1.setTime(sdf.parse(cd));
        this.currDate = cal1.getTime();

        int currYear = cal1.get(Calendar.YEAR);

        //Base Case : when current date is before 1st anniversary or within same year of sign up.
        if(cal1.get(Calendar.YEAR) - 1900 == cal.get(Calendar.YEAR) - 1900){
            System.out.println("No Range");
            return;
        }

        cal.set(Calendar.YEAR, currYear);

        // before registration date
        cal.add(Calendar.DATE, -30);
        Date beforeDate = cal.getTime();


        // after registration date +30 days
        cal.add(Calendar.DATE, 60);
        Date afterDate = cal.getTime();

        printRange(beforeDate, afterDate, cal, currYear);

    }
}