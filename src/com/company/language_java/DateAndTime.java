package com.company.language_java;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;

/**
 * Created By Abir Hasan on 15-Nov-19
 * <p>
 * Problem: Practice > Java > Introduction > Java Date and Time
 * <p>
 * Sample Input
 * <p>
 * 08 05 2015
 * <p>
 * Sample Output
 * <p>
 * WEDNESDAY
 */

public class DateAndTime {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int month = sc.nextInt();
        int day = sc.nextInt();
        int year = sc.nextInt();

        System.out.println(getDayName(day, month, year).toUpperCase());
        //getDay(day, month, year);

    }

    private static String getDayName(int day, int month, int year) {
        String input_date = day + "/" + month + "/" + year;
        SimpleDateFormat format1 = new SimpleDateFormat("dd/MM/yyyy");
        Date dt1 = null;
        try {
            dt1 = format1.parse(input_date);
        } catch (ParseException e) {
            e.printStackTrace();
        }
        DateFormat format2 = new SimpleDateFormat("EEEE");
        return format2.format(dt1).toUpperCase();
    }

    private static void getDay(int day, int month, int year) {
        month = month - 1; // cause in Calender class January is 0
        Calendar calendar = Calendar.getInstance();
        calendar.set(year, month, day);
        int dayOfWeek = calendar.get(Calendar.DAY_OF_WEEK);
        System.out.println(dayOfWeek);
    }

}
