package baekjoon.p04084;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (true) {
            int[] inputs = intArray(sc.nextLine().split(" "));
            if (all(inputs, 0)) {
                break;
            }
            System.out.println(solve(inputs));
        }
    }

    private static int solve(int[] inputs) {
        int ret = 0;
        int[] arr = inputs;

        while (!all(arr, arr[0])) {
            arr = arr(arr);
            ret++;
        }

        return ret;
    }

    private static int[] arr(int[] arr) {
        int len = arr.length;
        int[] ret = new int[len];

        for (int i = 0; i < len; i++) {
            int a = i;
            int b = (a + 1) % len;
            ret[i] = Math.abs(arr[a] - arr[b]);
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

    private static boolean all(int[] arr, int n) {
        for (int e : arr) {
            if (e != n) {
                return false;
            }
        }

        return true;
    }

}