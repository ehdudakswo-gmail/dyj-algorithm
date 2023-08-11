package baekjoon.p01547;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int m = sc.nextInt();
        int[][] inputs = new int[m][2];

        for (int i = 0; i < inputs.length; i++) {
            inputs[i][0] = sc.nextInt();
            inputs[i][1] = sc.nextInt();
        }

        System.out.println(solve(inputs));
    }

    private static int solve(int[][] inputs) {
        int[] pos = {0, 1, 2, 3};

        for (int[] input : inputs) {
            swap(pos, input[0], input[1]);
        }

        return idx(pos, 1);
    }

    private static void swap(int[] arr, int a, int b) {
        int temp = arr[a];
        arr[a] = arr[b];
        arr[b] = temp;
    }

    private static int idx(int[] arr, int target) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == target) {
                return i;
            }
        }

        return -1;
    }

}