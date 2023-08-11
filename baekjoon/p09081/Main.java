package baekjoon.p09081;

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
        int cut = cut(arr);
        if (cut == -1) {
            return input;
        }

        int min = min(arr, arr[cut]);
        swap(arr, cut, min);
        Arrays.sort(arr, cut + 1, arr.length);

        return new String(arr);
    }

    private static int cut(char[] arr) {
        for (int i = arr.length - 2; i >= 0; i--) {
            if (arr[i] < arr[i + 1]) {
                return i;
            }
        }

        return -1;
    }

    private static int min(char[] arr, char ch) {
        for (int i = arr.length - 1; i >= 0; i--) {
            if (arr[i] > ch) {
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