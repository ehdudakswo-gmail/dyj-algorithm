package baekjoon.p02697;

import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            System.out.println(solve(sc.next()));
        }
    }

    private static String solve(String input) {
        char[] arr = input.toCharArray();
        int idx = idx(arr);
        if (idx == -1) {
            return "BIGGEST";
        }

        swap(arr, idx, min(arr, idx));
        Arrays.sort(arr, idx + 1, arr.length);

        return String.valueOf(arr);
    }

    private static int idx(char[] arr) {
        for (int i = arr.length - 2; i >= 0; i--) {
            if (arr[i] < arr[i + 1]) {
                return i;
            }
        }

        return -1;
    }

    private static int min(char[] arr, int idx) {
        for (int i = arr.length - 1; i > idx; i--) {
            if (arr[i] > arr[idx]) {
                return i;
            }
        }

        return -1;
    }

    private static void swap(char[] arr, int a, int b) {
        char temp = arr[a];
        arr[a] = arr[b];
        arr[b] = temp;
    }

}