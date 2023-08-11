package baekjoon.p03028;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println(solve(sc.next()));
    }

    private static int solve(String input) {
        int[] arr = new int[]{1, 0, 0};
        int[][] set = {{0, 1}, {1, 2}, {0, 2}};

        for (char ch : input.toCharArray()) {
            int[] idx = set[ch - 'A'];
            swap(arr, idx[0], idx[1]);
        }

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 1) {
                return (i + 1);
            }
        }

        return -1;
    }

    private static void swap(int[] arr, int a, int b) {
        int aa = arr[a];
        int bb = arr[b];
        arr[a] = bb;
        arr[b] = aa;
    }

}