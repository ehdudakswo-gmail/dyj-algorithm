package baekjoon.p01834;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println(solve(sc.nextInt()));
    }

    private static long solve(int n) {
        long ret = 0;
        for (long i = 1; i < n; i++) {
            ret += (i * n + i);
        }

        return ret;
    }

}