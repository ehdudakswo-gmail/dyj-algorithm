package baekjoon.p11382;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println(solve(sc.nextLong(), sc.nextLong(), sc.nextLong()));
    }

    private static long solve(long a, long b, long c) {
        return (a + b + c);
    }

}