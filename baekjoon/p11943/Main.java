package baekjoon.p11943;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] a = new int[]{sc.nextInt(), sc.nextInt()};
        int[] b = new int[]{sc.nextInt(), sc.nextInt()};

        System.out.println(solve(a, b));
    }

    private static int solve(int[] a, int[] b) {
        return Math.min(a[0] + b[1], a[1] + b[0]);
    }

}
