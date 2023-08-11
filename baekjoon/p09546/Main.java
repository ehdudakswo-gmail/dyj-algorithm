package baekjoon.p09546;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while (t-- > 0) {
            System.out.println(solve(sc.nextInt()));
        }
    }

    private static int solve(int k) {
        double ret = 0;
        while (k-- > 0) {
            ret += 0.5;
            ret *= 2;
        }

        return (int) ret;
    }

}