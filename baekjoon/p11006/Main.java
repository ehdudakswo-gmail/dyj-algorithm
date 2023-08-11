package baekjoon.p11006;

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

    private static int[] solve(int n, int m) {
        return new int[]{
                m * 2 - n,
                m - (m * 2 - n)
        };
    }

}