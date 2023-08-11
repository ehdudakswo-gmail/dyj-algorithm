package baekjoon.p02845;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] a = intArray(sc.nextLine());
        int[] b = intArray(sc.nextLine());

        for (int output : solve(a, b)) {
            System.out.print(output + " ");
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

    private static int[] solve(int[] a, int[] b) {
        int n = a[0] * a[1];
        int[] ret = new int[b.length];

        for (int i = 0; i < ret.length; i++) {
            ret[i] = (b[i] - n);
        }

        return ret;
    }

}