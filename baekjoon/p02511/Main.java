package baekjoon.p02511;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] a = intArray(sc.nextLine().split(" "));
        int[] b = intArray(sc.nextLine().split(" "));

        for (String solve : solve(a, b)) {
            System.out.println(solve);
        }
    }

    private static int[] intArray(String[] arr) {
        int[] ret = new int[arr.length];

        for (int i = 0; i < ret.length; i++) {
            ret[i] = Integer.parseInt(arr[i]);
        }

        return ret;
    }

    private static String[] solve(int[] a, int[] b) {
        int[] ret = new int[2];
        for (int i = 0; i < a.length; i++) {
            if (a[i] > b[i]) {
                ret[0] += 3;
            } else if (a[i] < b[i]) {
                ret[1] += 3;
            } else {
                ret[0]++;
                ret[1]++;
            }
        }

        String ret2;
        if (ret[0] > ret[1]) {
            ret2 = "A";
        } else if (ret[0] < ret[1]) {
            ret2 = "B";
        } else {
            ret2 = last(a, b);
        }

        return new String[]{
                String.format("%d %d", ret[0], ret[1]),
                ret2
        };
    }

    private static String last(int[] a, int[] b) {
        for (int i = a.length - 1; i >= 0; i--) {
            if (a[i] > b[i]) {
                return "A";
            } else if (a[i] < b[i]) {
                return "B";
            }
        }

        return "D";
    }

}