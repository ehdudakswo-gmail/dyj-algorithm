package baekjoon.p01551;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        int[] inputs = intArray(sc.next().split(","));
        System.out.println(joinToString(solve(inputs, k), ","));
    }

    private static int[] solve(int[] inputs, int k) {
        int[] ret = inputs;
        while (k-- > 0) {
            ret = reduce(ret);
        }

        return ret;
    }

    private static int[] reduce(int[] arr) {
        int[] ret = new int[arr.length - 1];
        for (int i = 0; i < ret.length; i++) {
            ret[i] = arr[i + 1] - arr[i];
        }

        return ret;
    }

    private static int[] intArray(String[] arr) {
        int[] ret = new int[arr.length];
        for (int i = 0; i < ret.length; i++) {
            ret[i] = Integer.parseInt(arr[i]);
        }

        return ret;
    }

    private static String joinToString(int[] arr, String str) {
        StringBuilder sb = new StringBuilder();
        for (int e : arr) {
            sb.append(e);
            sb.append(str);
        }
        sb.delete(sb.length() - 1, sb.length());

        return sb.toString();
    }

}