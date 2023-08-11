package baekjoon.p11134;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while (t-- > 0) {
            System.out.println(solve(sc.nextInt(), sc.nextInt()));
        }
    }

    private static int solve(int n, int c) {
        if (n % c == 0) {
            return n / c;
        } else {
            return n / c + 1;
        }
    }

}