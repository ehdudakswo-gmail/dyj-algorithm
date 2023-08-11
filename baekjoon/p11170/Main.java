package baekjoon.p11170;

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

        for (int i = n; i <= m; i++) {
            ret += cnt(i, 0);
        }

        return ret;
    }

    private static int cnt(int num, int target) {
        int ret = 0;

        while (true) {
            if (num % 10 == target) {
                ret++;
            }

            num /= 10;
            if (num == 0) {
                break;
            }
        }

        return ret;
    }

}