package baekjoon.p02748;

import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

//        System.out.println(new P02748().solve(n));
        System.out.println(new P02748().solve2(n));
    }

}

class P02748 {

    private long[] cache;

    P02748() {
        cache = new long[91];
        Arrays.fill(cache, -1);
    }

    long solve(int n) {
        if (n == 0 || n == 1) {
            return n;
        }

        if (cache[n] != -1) {
            return cache[n];
        }

        long ret = solve(n - 2) + solve(n - 1);
        cache[n] = ret;
        return ret;
    }

    long solve2(int n) {
        long[] ret = new long[n + 1];
        ret[0] = 0;
        ret[1] = 1;

        for (int i = 2; i <= n; i++) {
            ret[i] = ret[i - 2] + ret[i - 1];
        }

        return ret[n];
    }

}