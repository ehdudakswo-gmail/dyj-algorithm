package baekjoon.p11650;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[][] inputs = new int[n][2];

        for (int i = 0; i < inputs.length; i++) {
            inputs[i][0] = sc.nextInt();
            inputs[i][1] = sc.nextInt();
        }

        solve(inputs);

        for (int[] input : inputs) {
            System.out.println(input[0] + " " + input[1]);
        }
    }

    private static void solve(int[][] inputs) {
        Arrays.sort(inputs, new P11650Comparator());
    }

    private static class P11650Comparator implements Comparator<int[]> {

        @Override
        public int compare(int[] a, int[] b) {
            int compX = a[0] - b[0];
            if (compX == 0) {
                return a[1] - b[1];
            } else {
                return compX;
            }
        }

    }

}