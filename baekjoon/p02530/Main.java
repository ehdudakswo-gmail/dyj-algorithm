package baekjoon.p02530;

import java.util.Locale;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int d = sc.nextInt();

        int totalSecond = (a * 3600) + (b * 60) + c + d;
        int hour = (totalSecond / 3600) % 24;
        int minute = (totalSecond / 60) % 60;
        int second = totalSecond % 60;

        String result = String.format(Locale.getDefault(), "%d %d %d", hour, minute, second);
        System.out.println(result);
    }

}