package baekjoon.p05724;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (true) {
            int input = sc.nextInt();
            if (input == 0) break;
            System.out.println(solve(input));
        }
    }

    private static int solve(int n) {
        int ret = 0;
        for (int i = 1; i <= n; i++) {
            int nn = (n - i + 1);
            ret += (nn * nn);
        }

        return ret;
    }

}