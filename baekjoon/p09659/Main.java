package baekjoon.p09659;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println(solve(sc.nextLong()));
    }

    private static String solve(long input) {
        if (input % 2 == 1) {
            return "SK";
        } else {
            return "CY";
        }
    }

}