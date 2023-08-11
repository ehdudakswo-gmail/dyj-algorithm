package baekjoon.p01964;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println(solve(sc.nextLong()));
    }

    private static long solve(long n) {
        long sum = 5;
        for (long i = 2; i <= n; i++) {
            sum += (i * 2 + i + 1);
        }

        return sum % 45678;
    }

}