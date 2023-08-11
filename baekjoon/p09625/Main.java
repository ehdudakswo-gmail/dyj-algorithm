package baekjoon.p09625;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int k = sc.nextInt();

        for (int solve : solve(k)) {
            System.out.print(solve + " ");
        }
    }

    private static int[] solve(int k) {
        int a = 1;
        int b = 0;

        while (k-- > 0) {
            int aa = b;
            int bb = a + b;
            a = aa;
            b = bb;
        }

        return new int[]{a, b};
    }

}