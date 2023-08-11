package baekjoon.p01735;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] a = new int[]{sc.nextInt(), sc.nextInt()};
        int[] b = new int[]{sc.nextInt(), sc.nextInt()};

        for (int solve : solve(a, b)) {
            System.out.print(solve + " ");
        }
    }

    private static int[] solve(int[] a, int[] b) {
        int aa = a[0] * b[1] + b[0] * a[1];
        int bb = a[1] * b[1];
        int gcd = gcd(aa, bb);

        return new int[]{aa / gcd, bb / gcd};
    }

    private static int gcd(int a, int b) {
        if (b == 0) {
            return a;
        }

        return gcd(b, a % b);
    }

}