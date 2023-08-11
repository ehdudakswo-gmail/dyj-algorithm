package baekjoon.p02920;

import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] inputs = new int[8];

        for (int i = 0; i < inputs.length; i++) {
            inputs[i] = sc.nextInt();
        }

        System.out.println(solve(inputs));
    }

    private static String solve(int[] inputs) {
        if (equals(inputs, sorted(inputs))) {
            return "ascending";
        } else if (equals(inputs, reversed(inputs))) {
            return "descending";
        } else {
            return "mixed";
        }
    }

    private static boolean equals(int[] a, int[] b) {
        for (int i = 0; i < a.length; i++) {
            if (a[i] != b[i]) {
                return false;
            }
        }

        return true;
    }

    private static int[] sorted(int[] arr) {
        int[] ret = arr.clone();
        Arrays.sort(ret);

        return ret;
    }

    private static int[] reversed(int[] arr) {
        int[] sorted = sorted(arr);
        int[] ret = new int[sorted.length];

        for (int i = 0; i < ret.length; i++) {
            ret[i] = sorted[ret.length - i - 1];
        }

        return ret;
    }

}