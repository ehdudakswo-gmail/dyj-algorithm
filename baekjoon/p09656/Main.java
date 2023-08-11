package baekjoon.p09656;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println(solve(sc.nextInt()));
    }

    private static String solve(int input) {
        if (input % 2 == 0) {
            return "SK";
        } else {
            return "CY";
        }
    }

}