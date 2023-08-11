package baekjoon.p02921;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println(solve(sc.nextInt()));
    }

    private static int solve(int n) {
        int ret = 0;

        for (int i = 0; i <= n; i++) {
            for (int j = 0; j <= i; j++) {
                ret += (i + j);
            }
        }

        return ret;
    }

}