package com.lypgod.demo.S01_Introduction;

import java.io.IOException;
import java.util.Calendar;

class Result {

    /*
     * Complete the 'findDay' function below.
     *
     * The function is expected to return a STRING.
     * The function accepts following parameters:
     *  1. INTEGER month
     *  2. INTEGER day
     *  3. INTEGER year
     */

    public static String findDay(int month, int day, int year) {
        Calendar calendar = Calendar.getInstance();
        calendar.set(year, month - 1, day);
        calendar.setTime(calendar.getTime());

        if (Calendar.MONDAY == calendar.get(Calendar.DAY_OF_WEEK)) {
            return "MONDAY";
        }
        if (Calendar.TUESDAY == calendar.get(Calendar.DAY_OF_WEEK)) {
            return "TUESDAY";
        }
        if (Calendar.WEDNESDAY == calendar.get(Calendar.DAY_OF_WEEK)) {
            return "WEDNESDAY";
        }
        if (Calendar.THURSDAY == calendar.get(Calendar.DAY_OF_WEEK)) {
            return "THURSDAY";
        }
        if (Calendar.FRIDAY == calendar.get(Calendar.DAY_OF_WEEK)) {
            return "FRIDAY";
        }
        if (Calendar.SATURDAY == calendar.get(Calendar.DAY_OF_WEEK)) {
            return "SATURDAY";
        }
        if (Calendar.SUNDAY == calendar.get(Calendar.DAY_OF_WEEK)) {
            return "SUNDAY";
        }
        return "";
    }

}


public class P12_Java_Date_and_Time {
    public static void main(String[] args) throws IOException {
        String res = Result.findDay(8, 5, 2015);
        System.out.println(res);
    }
}
