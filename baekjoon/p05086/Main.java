package baekjoon.p05086;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (true) {
            int a = sc.nextInt();
            int b = sc.nextInt();

            if (a == 0 && b == 0) {
                break;
            }

            System.out.println(solve(a, b));
        }
    }

    private static String solve(int a, int b) {
        if (a % b == 0) {
            return "multiple";
        } else if (b % a == 0) {
            return "factor";
        } else {
            return "neither";
        }
    }

}