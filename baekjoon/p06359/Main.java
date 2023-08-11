package baekjoon.p06359;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while (t-- > 0) {
            System.out.println(solve(sc.nextInt()));
        }
    }

    private static int solve(int n) {
        boolean[] arr = new boolean[n + 1];

        for (int i = 1; i <= n; i++) {
            for (int j = i; j <= n; j += i) {
                arr[j] = !arr[j];
            }
        }

        int ret = 0;
        for (int i = 1; i <= n; i++) {
            if (arr[i]) {
                ret++;
            }
        }

        return ret;
    }

}