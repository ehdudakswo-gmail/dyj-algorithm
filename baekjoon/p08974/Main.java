package baekjoon.p08974;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println(solve(sc.nextInt(), sc.nextInt()));
    }

    private static int solve(int a, int b) {
        return sum(arr(b), a - 1, b - 1);
    }

    private static int[] arr(int n) {
        int[] ret = new int[n];
        int nn = 1;
        int idx = 0;

        while (true) {
            int repeat = nn;
            while (repeat-- > 0) {
                ret[idx++] = nn;
                if (idx >= n) {
                    return ret;
                }
            }
            nn++;
        }
    }

    private static int sum(int[] arr, int a, int b) {
        int ret = 0;

        for (int i = a; i <= b; i++) {
            ret += arr[i];
        }

        return ret;
    }

}