package baekjoon.p11536;

import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String[] inputs = new String[n];

        for (int i = 0; i < inputs.length; i++) {
            inputs[i] = sc.next();
        }

        System.out.println(solve(inputs));
    }

    private static String solve(String[] inputs) {
        String[] sorted = sorted(inputs);
        String[] descending = reverse(sorted);

        if (same(inputs, sorted)) {
            return "INCREASING";
        } else if (same(inputs, descending)) {
            return "DECREASING";
        } else {
            return "NEITHER";
        }
    }

    private static String[] sorted(String[] arr) {
        String[] ret = Arrays.copyOfRange(arr, 0, arr.length);
        Arrays.sort(ret);

        return ret;
    }

    private static String[] reverse(String[] arr) {
        String[] ret = new String[arr.length];
        for (int i = 0; i < ret.length; i++) {
            ret[i] = arr[ret.length - i - 1];
        }

        return ret;
    }

    private static boolean same(String[] a, String[] b) {
        for (int i = 0; i < a.length; i++) {
            if (!a[i].equals(b[i])) {
                return false;
            }
        }

        return true;
    }

}