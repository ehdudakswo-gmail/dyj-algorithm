package baekjoon.p02997;

import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println(solve(sc.nextInt(), sc.nextInt(), sc.nextInt()));
    }

    private static int solve(int a, int b, int c) {
        int[] arr = new int[]{a, b, c};
        Arrays.sort(arr);

        int diff = Math.min(arr[2] - arr[1], arr[1] - arr[0]);
        for (int i = 1; i <= 4; i++) {
            int n = (arr[0] + diff * i);
            if (!contain(arr, n)) {
                return n;
            }
        }

        return 0;
    }

    private static boolean contain(int[] arr, int n) {
        for (int e : arr) {
            if (e == n) {
                return true;
            }
        }

        return false;
    }

}