package baekjoon.p02747;

import java.util.Arrays;
import java.util.Scanner;

public class Main {

    private static int[] cache;

    public static void main(String[] args) {
        cache = new int[46];
        Arrays.fill(cache, -1);

        Scanner sc = new Scanner(System.in);
//        System.out.println(solve(sc.nextInt()));
        System.out.println(solve2(sc.nextInt()));
    }

    private static int solve(int n) {
        if (n <= 1) {
            return n;
        }

        if (cache[n] != -1) {
            return cache[n];
        }

        int ret = solve(n - 2) + solve(n - 1);
        cache[n] = ret;

        return ret;
    }

    private static int solve2(int n) {
        int[] ret = new int[n + 1];
        ret[0] = 0;
        ret[1] = 1;

        for (int i = 2; i <= n; i++) {
            ret[i] = ret[i - 2] + ret[i - 1];
        }

        return ret[n];
    }

}