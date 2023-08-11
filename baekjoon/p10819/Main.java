package baekjoon.p10819;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] inputs = new int[n];

        for (int i = 0; i < inputs.length; i++) {
            inputs[i] = sc.nextInt();
        }

        System.out.println(solve(inputs));
    }

    private static int solve(int[] inputs) {
        int[] arr = inputs.clone();
        Arrays.sort(arr);

        int ret = -1;
        for (int[] e : list(arr)) {
            ret = Math.max(ret, sum(e));
        }

        return ret;
    }

    private static List<int[]> list(int[] arr) {
        List<int[]> ret = new ArrayList<>();
        int[] next = arr;

        while (next != null) {
            ret.add(next);
            next = next(next);
        }

        return ret;
    }

    private static int[] next(int[] inputs) {
        int[] arr = inputs.clone();
        int cut = cut(arr);
        if (cut == -1) {
            return null;
        }

        int min = min(arr, arr[cut]);
        swap(arr, cut, min);
        Arrays.sort(arr, cut + 1, arr.length);

        return arr;
    }

    private static int cut(int[] arr) {
        for (int i = arr.length - 2; i >= 0; i--) {
            if (arr[i] < arr[i + 1]) {
                return i;
            }
        }

        return -1;
    }

    private static int min(int[] arr, int n) {
        for (int i = arr.length - 1; i >= 0; i--) {
            if (arr[i] > n) {
                return i;
            }
        }

        return -1;
    }

    private static void swap(int[] arr, int a, int b) {
        int temp = arr[a];
        arr[a] = arr[b];
        arr[b] = temp;
    }

    private static int sum(int[] arr) {
        int ret = 0;
        for (int i = 0; i < arr.length - 1; i++) {
            ret += Math.abs(arr[i] - arr[i + 1]);
        }

        return ret;
    }

}