package baekjoon.p10419;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while (t-- > 0) {
            System.out.println(solve(sc.nextInt()));
        }
    }

    private static int solve(int d) {
        int t = 0;

        while (t * (t + 1) <= d) {
            t++;
        }

        return (t - 1);
    }

}