package baekjoon.p02609;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        for (int ret : solve(sc.nextInt(), sc.nextInt())) {
            System.out.println(ret);
        }
    }

    private static int[] solve(int a, int b) {
        int[] ret = new int[2];

        int gcd = gcd(a, b);
        int lcm = (a * b) / gcd;

        ret[0] = gcd;
        ret[1] = lcm;

        return ret;
    }

    private static int gcd(int a, int b) {
        if (a % b == 0) {
            return b;
        }

        return gcd(b, a % b);
    }

}