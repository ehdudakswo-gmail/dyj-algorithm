package baekjoon.p10811;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int[][] inputs = new int[m][2];

        for (int[] input : inputs) {
            input[0] = sc.nextInt();
            input[1] = sc.nextInt();
        }

        for (int solve : solve(n, inputs)) {
            System.out.print(solve + " ");
        }
    }

    private static int[] solve(int n, int[][] inputs) {
        int[] ret = arr(n);
        for (int[] input : inputs) {
            reverse(ret, input[0] - 1, input[1] - 1);
        }

        return ret;
    }

    private static int[] arr(int n) {
        int[] ret = new int[n];
        for (int i = 0; i < ret.length; i++) {
            ret[i] = (i + 1);
        }

        return ret;
    }

    private static void reverse(int[] arr, int from, int to) {
        for (int i = from, j = to; i <= j; i++, j--) {
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
        }
    }

}