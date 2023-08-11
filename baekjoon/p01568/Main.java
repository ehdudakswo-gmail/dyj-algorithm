package baekjoon.p01568;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println(solve(sc.nextInt()));
    }

    private static int solve(int n) {
        int ret = 0;
        int i = 1;

        while (n > 0) {
            if (i > n) {
                i = 1;
            }
            n -= i;
            ret++;
            i++;
        }

        return ret;
    }

}