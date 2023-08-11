package baekjoon.p10972;

import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] inputs = new int[n];

        for (int i = 0; i < inputs.length; i++) {
            inputs[i] = sc.nextInt();
        }

        for (int solve : solve(inputs)) {
            System.out.print(solve + " ");
        }
    }

    private static int[] solve(int[] inputs) {
        int[] ret = inputs.clone();
        int cut = cut(ret);
        if (cut == -1) {
            return new int[]{-1};
        }

        int min = min(ret, ret[cut]);
        swap(ret, cut, min);
        Arrays.sort(ret, cut + 1, ret.length);

        return ret;
    }

    private static int cut(int[] arr) {
        for (int i = arr.length - 2; i >= 0; i--) {
            if (arr[i] < arr[i + 1]) {
                return i;
            }
        }

        return -1;
    }

    private static int min(int[] arr, int n) {
        for (int i = arr.length - 1; i >= 0; i--) {
            if (arr[i] > n) {
                return i;
            }
        }

        return -1;
    }

    private static void swap(int[] arr, int a, int b) {
        int temp = arr[a];
        arr[a] = arr[b];
        arr[b] = temp;
    }

}