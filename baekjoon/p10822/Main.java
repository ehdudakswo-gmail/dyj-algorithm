package baekjoon.p10822;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println(solve(sc.next()));
    }

    private static int solve(String input) {
        return sum(intArr(input.split(",")));
    }

    private static int[] intArr(String[] arr) {
        int[] ret = new int[arr.length];

        for (int i = 0; i < ret.length; i++) {
            ret[i] = Integer.parseInt(arr[i]);
        }

        return ret;
    }

    private static int sum(int[] arr) {
        int ret = 0;

        for (int n : arr) {
            ret += n;
        }

        return ret;
    }

}