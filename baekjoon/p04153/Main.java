package baekjoon.p04153;

import java.util.Arrays;
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

    private static String solve(int[] inputs) {
        Arrays.sort(inputs);
        if (inputs[0] * inputs[0] + inputs[1] * inputs[1] == inputs[2] * inputs[2]) {
            return "right";
        } else {
            return "wrong";
        }
    }

}