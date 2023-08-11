package baekjoon.p01065;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println(solve(sc.nextInt()));
    }

    private static int solve(int n) {
        int ret = 0;
        for (int i = 1; i <= n; i++) {
            if (check(i)) {
                ret++;
            }
        }

        return ret;
    }

    private static boolean check(int n) {
        if (n < 100) {
            return true;
        }

        String str = String.valueOf(n);
        int[] arr = new int[str.length()];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = str.charAt(i) - '0';
        }

        int diff = arr[0] - arr[1];
        for (int i = 0; i < arr.length - 1; i++) {
            if (arr[i] - arr[i + 1] != diff) {
                return false;
            }
        }

        return true;
    }

}
