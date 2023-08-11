package baekjoon.p03004;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println(solve(sc.nextInt()));
    }

    private static int solve(int n) {
        int ret = 2;
        int add = 2;

        for (int i = 1; i < n; i++) {
            ret += add;
            if (i % 2 == 0) {
                add++;
            }
        }

        return ret;
    }

}