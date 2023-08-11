package baekjoon.p05635;

import java.util.Arrays;
import java.util.Calendar;
import java.util.Comparator;
import java.util.Date;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        P05635[] inputs = new P05635[n];

        for (int i = 0; i < inputs.length; i++) {
            inputs[i] = new P05635(
                    sc.next(),
                    sc.nextInt(),
                    sc.nextInt(),
                    sc.nextInt()
            );
        }

        for (String ret : solve(inputs)) {
            System.out.println(ret);
        }
    }

    private static String[] solve(P05635[] inputs) {
        String[] ret = new String[2];

        Arrays.sort(inputs, new P05635Comparator());
        ret[0] = inputs[inputs.length - 1].getName();
        ret[1] = inputs[0].getName();

        return ret;
    }

}

class P05635 {

    private String name;
    private int day;
    private int month;
    private int year;

    P05635(String name, int day, int month, int year) {
        this.name = name;
        this.day = day;
        this.month = month;
        this.year = year;
    }

    String getName() {
        return name;
    }

    int getDay() {
        return day;
    }

    int getMonth() {
        return month;
    }

    int getYear() {
        return year;
    }

}

class P05635Comparator implements Comparator<P05635> {

    @Override
    public int compare(P05635 obj, P05635 obj2) {
        Calendar cal = Calendar.getInstance();
        Calendar cal2 = Calendar.getInstance();

        cal.set(Calendar.YEAR, obj.getYear());
        cal.set(Calendar.MONTH, obj.getMonth());
        cal.set(Calendar.DATE, obj.getDay());

        cal2.set(Calendar.YEAR, obj2.getYear());
        cal2.set(Calendar.MONTH, obj2.getMonth());
        cal2.set(Calendar.DATE, obj2.getDay());

        Date date = cal.getTime();
        Date date2 = cal2.getTime();

        return date.compareTo(date2);
    }

}