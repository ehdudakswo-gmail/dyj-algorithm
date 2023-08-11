package baekjoon.p05585;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println(solve(sc.nextInt()));
    }

    private static int solve(int input) {
        int ret = 0;
        int n = 1000 - input;
        int[] set = {500, 100, 50, 10, 5, 1};

        for (int s : set) {
            ret += (n / s);
            n %= s;
        }

        return ret;
    }

}