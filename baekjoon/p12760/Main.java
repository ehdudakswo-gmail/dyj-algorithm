package baekjoon.p12760;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int[][] inputs = new int[n][m];

        for (int i = 0; i < inputs.length; i++) {
            for (int j = 0; j < inputs[i].length; j++) {
                inputs[i][j] = sc.nextInt();
            }
        }

        for (int solve : solve(inputs, n, m)) {
            System.out.print(solve + " ");
        }
    }

    private static List<Integer> solve(int[][] inputs, int n, int m) {
        for (int[] e : inputs) {
            Arrays.sort(e);
        }

        int[] score = new int[n];
        for (int i = m - 1; i >= 0; i--) {
            int[] temp = new int[n];
            for (int j = 0; j < temp.length; j++) {
                temp[j] = inputs[j][i];
            }

            int max = max(temp);
            for (int k = 0; k < score.length; k++) {
                if (inputs[k][i] == max) {
                    score[k]++;
                }
            }
        }

        List<Integer> ret = new ArrayList<>();
        int max = max(score);
        for (int i = 0; i < score.length; i++) {
            if (score[i] == max) {
                ret.add(i + 1);
            }
        }

        return ret;
    }

    private static int max(int[] arr) {
        int ret = arr[0];
        for (int e : arr) {
            ret = Math.max(ret, e);
        }

        return ret;
    }

}