package baekjoon.p11651;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[][] inputs = new int[n][2];

        for (int[] input : inputs) {
            input[0] = sc.nextInt();
            input[1] = sc.nextInt();
        }

        solve(inputs);
        for (int[] input : inputs) {
            System.out.println(input[0] + " " + input[1]);
        }
    }

    private static void solve(int[][] inputs) {
        Arrays.sort(inputs, new P11651Comparator());
    }

    private static class P11651Comparator implements Comparator<int[]> {

        @Override
        public int compare(int[] a, int[] b) {
            int compY = a[1] - b[1];
            if (compY == 0) {
                return a[0] - b[0];
            } else {
                return compY;
            }
        }

    }

}