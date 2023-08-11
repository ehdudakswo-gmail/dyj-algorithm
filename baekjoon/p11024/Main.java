package baekjoon.p11024;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        sc.nextLine();

        while (t-- > 0) {
            int[] inputs = intArray(sc.nextLine().split(" "));
            System.out.println(solve(inputs));
        }
    }

    private static int[] intArray(String[] arr) {
        int[] ret = new int[arr.length];

        for (int i = 0; i < ret.length; i++) {
            ret[i] = Integer.parseInt(arr[i]);
        }

        return ret;
    }

    private static int solve(int[] inputs) {
        int ret = 0;

        for (int n : inputs) {
            ret += n;
        }

        return ret;
    }

}