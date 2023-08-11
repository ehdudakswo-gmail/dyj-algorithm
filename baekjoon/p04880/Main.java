package baekjoon.p04880;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (true) {
            int[] inputs = intArray(sc.nextLine().split(" "));
            if (all(inputs, 0)) {
                break;
            }

            for (String solve : solve(inputs[0], inputs[1], inputs[2])) {
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

    private static String[] solve(int a, int b, int c) {
        if (b - a == c - b) {
            return new String[]{
                    "AP",
                    String.valueOf(c + (b - a))
            };
        } else {
            return new String[]{
                    "GP",
                    String.valueOf(c * (b / a))
            };
        }
    }

}