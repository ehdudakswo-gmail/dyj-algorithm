package baekjoon.p02702;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while (t-- > 0) {
            for (int solve : solve(sc.nextInt(), sc.nextInt())) {
                System.out.print(solve + " ");
            }

            System.out.println();
        }
    }

    private static int[] solve(int a, int b) {
        int gcd = gcd(a, b);

        return new int[]{
                (a * b) / gcd,
                gcd
        };
    }

    private static int gcd(int a, int b) {
        if (a % b == 0) {
            return b;
        }

        return gcd(b, a % b);
    }

}