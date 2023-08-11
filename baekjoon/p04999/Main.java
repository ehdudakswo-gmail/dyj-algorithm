package baekjoon.p04999;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println(solve(sc.next(), sc.next()));
    }

    private static String solve(String a, String b) {
        if (a.length() >= b.length()) {
            return "go";
        } else {
            return "no";
        }
    }

}