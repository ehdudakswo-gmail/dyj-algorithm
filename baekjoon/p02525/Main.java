package baekjoon.p02525;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        int totalMinute = (a * 60) + b + c;
        int hour = (totalMinute / 60) % 24;
        int minute = totalMinute % 60;

        System.out.print(hour + " " + minute);
    }

}