package baekjoon.p10813;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int[][] inputs = new int[m][2];

        for (int i = 0; i < inputs.length; i++) {
            for (int j = 0; j < inputs[i].length; j++) {
                inputs[i][j] = sc.nextInt();
            }
        }

        for (int solve : solve(n, inputs)) {
            System.out.print(solve + " ");
        }
    }

    private static int[] solve(int n, int[][] inputs) {
        int[] ret = arr(n);

        for (int[] input : inputs) {
            swap(ret, input[0] - 1, input[1] - 1);
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

    private static void swap(int[] arr, int a, int b) {
        int temp = arr[a];
        arr[a] = arr[b];
        arr[b] = temp;
    }

}