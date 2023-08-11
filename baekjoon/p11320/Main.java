package baekjoon.p11320;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while (t-- > 0) {
            System.out.println(solve(sc.nextInt(), sc.nextInt()));
        }
    }

    private static int solve(int a, int b) {
        return ((a * a) / (b * b));
    }

}