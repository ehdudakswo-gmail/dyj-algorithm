package baekjoon.p01934;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        for (int i = 0; i < t; i++) {
            int a = sc.nextInt();
            int b = sc.nextInt();
            System.out.println(solve(a, b));
        }
    }

    private static int solve(int a, int b) {
        return ((a * b) / gcd(a, b));
    }

    private static int gcd(int a, int b) {
        if (a % b == 0) {
            return b;
        }

        return gcd(b, a % b);
    }

}

/*
    A = aG
    B = bG
    A = q*B + r
    r = A - q*B = aG - q*bG = (a-b*q)G
    G(A, B) = G(B, r)

    A = 15 = 5*3
    B = 6 = 2*3
    r = 3 = 5*3 - 2*2*3 = (5 - 2*2)*3
*/