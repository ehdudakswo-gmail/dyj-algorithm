package baekjoon.p02754;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.next();
        System.out.println(solve(input));
    }

    private static double solve(String input) {
        if (input.equals("F")) {
            return 0;
        }

        double ret = 1;
        ret += ('D' - input.charAt(0));
        ret += getPoint(input.charAt(1));

        return ret;
    }

    private static double getPoint(char ch) {
        switch (ch) {
            case '+':
                return 0.3;
            case '-':
                return -0.3;
            default:
                return 0;
        }
    }

}