package baekjoon.p11949;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();

        int[] inputs = new int[n];
        for (int i = 0; i < inputs.length; i++) {
            inputs[i] = sc.nextInt();
        }

        for (int solve : solve(n, m, inputs)) {
            System.out.println(solve);
        }
    }

    private static int[] solve(int n, int m, int[] inputs) {
        int[] ret = inputs.clone();

        for (int i = 1; i <= m; i++) {
            for (int j = 0; j < ret.length - 1; j++) {
                if (ret[j] % i > ret[j + 1] % i) {
                    swap(ret, j, j + 1);
                }
            }
        }

        return ret;
    }

    private static void swap(int[] arr, int a, int b) {
        int temp = arr[a];
        arr[a] = arr[b];
        arr[b] = temp;
    }

}