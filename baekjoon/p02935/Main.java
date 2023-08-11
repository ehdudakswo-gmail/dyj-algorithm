package baekjoon.p02935;

import java.math.BigInteger;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a = sc.next();
        String oper = sc.next();
        String b = sc.next();

        System.out.println(solve(a, oper, b));
    }

    private static String solve(String a, String oper, String b) {
        switch (oper) {
            case "+":
                return new BigInteger(a).add(new BigInteger(b)).toString();
            case "*":
                return new BigInteger(a).multiply(new BigInteger(b)).toString();
            default:
                return "";
        }
    }

}