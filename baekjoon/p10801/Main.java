package baekjoon.p10801;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] a = new int[10];
        int[] b = new int[10];

        for (int i = 0; i < a.length; i++) {
            a[i] = sc.nextInt();
        }

        for (int i = 0; i < b.length; i++) {
            b[i] = sc.nextInt();
        }

        System.out.println(solve(a, b));
    }

    private static String solve(int[] a, int[] b) {
        int[] win = new int[2];

        for (int i = 0; i < a.length; i++) {
            if (a[i] > b[i]) {
                win[0]++;
            } else if (a[i] < b[i]) {
                win[1]++;
            }
        }

        if (win[0] > win[1]) {
            return "A";
        } else if (win[0] < win[1]) {
            return "B";
        } else {
            return "D";
        }
    }

}