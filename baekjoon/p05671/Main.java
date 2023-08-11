package baekjoon.p05671;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()) {
            System.out.println(solve(sc.nextInt(), sc.nextInt()));
        }
    }

    private static int solve(int n, int m) {
        int ret = 0;
        for (int i = n; i <= m; i++) {
            if (check(i)) {
                ret++;
            }
        }

        return ret;
    }

    private static boolean check(int n) {
        int[] cnt = new int[10];
        while (n != 0) {
            cnt[n % 10]++;
            n /= 10;
        }

        for (int e : cnt) {
            if (e > 1) {
                return false;
            }
        }

        return true;
    }

}