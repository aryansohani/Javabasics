package Datetime;

//in java1.8 these package java.date was introduced by jorda these has most precise and advance method to manage date and time
//thus it is also called as jorda apis
//it has predefined class LocalDate and LocalTime and has predefined methods

import java.time.*;

public class Dateusingjavatime{

    public static void main( String[] args)
    {
        LocalDate d= LocalDate.now(); //=> now() is the method of class localdate
        LocalTime t= LocalTime.now(); 

        System.out.println(d);
        System.out.println(t);

        int month=d.getMonthValue();
        int year=d.getYear();
        int date= d.getDayOfMonth();

        int dayofyear= d.getDayOfYear();

        System.out.println(date+"/"+month+"/"+year);

        System.out.println("the day of year is"+dayofyear);

       int hr= t.getHour();
       int min =t.getMinute();
       int sec= t.getSecond();
       int nanosec=t.getNano();

       System.out.println(hr+"/"+min+"/"+sec+"/"+nanosec);

       

    }
    
}