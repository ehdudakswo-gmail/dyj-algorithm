package baekjoon.p05656;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int i = 1;

        while (true) {
            int a = sc.nextInt();
            String oper = sc.next();
            int b = sc.nextInt();

            if (oper.equals("E")) {
                break;
            } else {
                System.out.println(String.format("Case %d: %s", i++, solve(oper, a, b)));
            }
        }
    }

    private static boolean solve(String oper, int a, int b) {
        switch (oper) {
            case ">":
                return a > b;
            case ">=":
                return a >= b;
            case "<":
                return a < b;
            case "<=":
                return a <= b;
            case "==":
                return a == b;
            case "!=":
                return a != b;
            default:
                return false;
        }
    }

}