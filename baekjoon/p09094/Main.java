package baekjoon.p09094;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while (t-- > 0) {
            System.out.println(solve(sc.nextInt(), sc.nextInt()));
        }
    }

    private static int solve(int n, int m) {
        int ret = 0;

        for (int a = 1; a < n; a++) {
            for (int b = a + 1; b < n; b++) {
                if ((a * a + b * b + m) % (a * b) == 0) {
                    ret++;
                }
            }
        }

        return ret;
    }

}