package com.campusdual.statics;

import java.util.Calendar;
import java.util.Date;

public class StaticMethod {

    public static String countDownToYear(String name, int year){
        Date today = new Date();
        System.out.println(today);
        Calendar calendar = Calendar.getInstance();
        System.out.println(calendar.getTime());
        calendar.set(year,0,1,0,0,0);
       Date targetDate = calendar.getTime();
        System.out.println(targetDate);
        return "";
   }

   public static void main(String[] args){
        countDownToYear("Alejandro",2222);
   }

}

