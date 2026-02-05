package Datetime;
// here we will use date and tim using java.util.date package

import java.util.Date;

public class Dateusingjavautil {
    public static void main (String[] args)
    {
        Date d= new Date();
        System.out.println(d);              //these print day.date.time.year
       long time= d.getTime();
       System.out.println(time);
       Date d2 = new Date(d.getTime() + 1000);

       System.out.println(d.before(d2));//these compare whether date is before the date



    }
    
}
