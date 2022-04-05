package PracticeProgramsForReference;

import java.util.Calendar;
import java.util.Locale;
import java.util.Scanner;

public class JavaDateandTime {

    public static String findDay(int month, int day, int year) {

        Calendar cal = Calendar.getInstance();
        cal.set(Calendar.MONTH, month-1);
        cal.set(Calendar.DAY_OF_MONTH, day);
        cal.set(Calendar.YEAR, year);
        return cal.getDisplayName(Calendar.DAY_OF_WEEK, Calendar.LONG, Locale.US).toUpperCase();
    }

    public static void main(String[] args){
        int month = 12;
        int day = 5;
        int year = 2021;
        String localtime = findDay(month,day,year);
        System.out.println(localtime);
    }

}
