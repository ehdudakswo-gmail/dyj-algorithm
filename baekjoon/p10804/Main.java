package baekjoon.p10804;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[][] inputs = new int[10][2];

        for (int i = 0; i < inputs.length; i++) {
            for (int j = 0; j < inputs[i].length; j++) {
                inputs[i][j] = sc.nextInt();
            }
        }

        for (int solve : solve(inputs)) {
            System.out.print(solve + " ");
        }
    }

    private static int[] solve(int[][] inputs) {
        int[] ret = new int[20];
        for (int i = 0; i < ret.length; i++) {
            ret[i] = (i + 1);
        }

        for (int[] input : inputs) {
            reverse(ret, input[0] - 1, input[1] - 1);
        }

        return ret;
    }

    private static void reverse(int[] arr, int a, int b) {
        int i = a;
        int j = b;

        while (i <= j) {
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
            i++;
            j--;
        }
    }

}