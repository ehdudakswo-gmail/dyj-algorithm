package baekjoon.p02985;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println(solve(sc.nextInt(), sc.nextInt(), sc.nextInt()));
    }

    private static String solve(int a, int b, int c) {
        String oper = oper(a, b, c);
        String oper2 = oper(b, c, a);

        if (oper != null) {
            return String.format("%d%s%d=%d", a, oper, b, c);
        } else {
            return String.format("%d=%d%s%d", a, b, oper2, c);
        }
    }

    private static String oper(int a, int b, int c) {
        if (a + b == c) {
            return "+";
        } else if (a - b == c) {
            return "-";
        } else if (a * b == c) {
            return "*";
        } else if (a / b == c) {
            return "/";
        } else {
            return null;
        }
    }

}