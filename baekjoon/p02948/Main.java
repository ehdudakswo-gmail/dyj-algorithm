package baekjoon.p02948;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws ParseException {
        Scanner sc = new Scanner(System.in);
        System.out.println(solve(sc.nextInt(), sc.nextInt()));
    }

    private static String solve(int d, int m) throws ParseException {
        String dateStr = String.format("2009%02d%02d", m, d);
        Date date = new SimpleDateFormat("yyyyMMdd").parse(dateStr);

        Calendar calendar = Calendar.getInstance();
        calendar.setTime(date);

        return week(calendar.get(Calendar.DAY_OF_WEEK));
    }

    private static String week(int week) {
        switch (week) {
            case Calendar.SUNDAY:
                return "Sunday";
            case Calendar.MONDAY:
                return "Monday";
            case Calendar.TUESDAY:
                return "Tuesday";
            case Calendar.WEDNESDAY:
                return "Wednesday";
            case Calendar.THURSDAY:
                return "Thursday";
            case Calendar.FRIDAY:
                return "Friday";
            case Calendar.SATURDAY:
                return "Saturday";
            default:
                return "None";
        }
    }

}