package baekjoon.p04435;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        sc.nextLine();

        for (int tt = 1; tt <= t; tt++) {
            int[][] inputs = new int[2][];
            inputs[0] = intArray(sc.nextLine());
            inputs[1] = intArray(sc.nextLine());
            System.out.println(String.format("Battle %d: %s", tt, solve(inputs)));
        }
    }

    private static int[] intArray(String str) {
        String[] arr = str.split(" ");
        int[] ret = new int[arr.length];

        for (int i = 0; i < ret.length; i++) {
            ret[i] = Integer.parseInt(arr[i]);
        }

        return ret;
    }

    private static String solve(int[][] inputs) {
        int[] a = {1, 2, 3, 3, 4, 10};
        int[] b = {1, 2, 2, 2, 3, 5, 10};

        int aa = mulSum(inputs[0], a);
        int bb = mulSum(inputs[1], b);

        if (aa > bb) {
            return "Good triumphs over Evil";
        } else if (aa < bb) {
            return "Evil eradicates all trace of Good";
        } else {
            return "No victor on this battle field";
        }
    }

    private static int mulSum(int[] a, int[] b) {
        int ret = 0;

        for (int i = 0; i < a.length; i++) {
            ret += (a[i] * b[i]);
        }

        return ret;
    }

}