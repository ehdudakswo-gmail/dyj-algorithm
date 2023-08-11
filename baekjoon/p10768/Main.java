package baekjoon.p10768;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println(solve(sc.nextInt(), sc.nextInt()));
    }

    private static String solve(int a, int b) {
        if (a < 2) {
            return "Before";
        } else if (a > 2) {
            return "After";
        } else {
            if (b < 18) {
                return "Before";
            } else if (b > 18) {
                return "After";
            } else {
                return "Special";
            }
        }
    }

}