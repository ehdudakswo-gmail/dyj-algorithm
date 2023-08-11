package baekjoon.p11312;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while (t-- > 0) {
            System.out.println(solve(sc.nextLong(), sc.nextLong()));
        }
    }

    private static long solve(long a, long b) {
        long ret = 0;
        long add = 1;
        long n = (a / b);

        while (n-- > 0) {
            ret += add;
            add += 2;
        }

        return ret;
    }

}