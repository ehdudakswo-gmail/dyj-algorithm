package baekjoon.p10599;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (true) {
            int[] inputs = intArray(sc.nextLine().split(" "));
            if (all(inputs, 0)) {
                break;
            }

            for (int solve : solve(inputs)) {
                System.out.print(solve + " ");
            }
            System.out.println();
        }
    }

    private static int[] intArray(String[] arr) {
        int[] ret = new int[arr.length];
        for (int i = 0; i < ret.length; i++) {
            ret[i] = Integer.parseInt(arr[i]);
        }

        return ret;
    }

    private static boolean all(int[] arr, int check) {
        for (int n : arr) {
            if (n != check) {
                return false;
            }
        }

        return true;
    }

    private static int[] solve(int[] inputs) {
        return new int[]{
                inputs[2] - inputs[1],
                inputs[3] - inputs[0]
        };
    }

}