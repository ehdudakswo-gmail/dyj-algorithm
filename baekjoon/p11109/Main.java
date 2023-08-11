package baekjoon.p11109;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while (t-- > 0) {
            System.out.println(solve(sc.nextInt(), sc.nextInt(), sc.nextInt(), sc.nextInt()));
        }
    }

    private static String solve(int d, int n, int s, int p) {
        int a = d + n * p;
        int b = n * s;

        if (a < b) {
            return "parallelize";
        } else if (a > b) {
            return "do not parallelize";
        } else {
            return "does not matter";
        }
    }

}