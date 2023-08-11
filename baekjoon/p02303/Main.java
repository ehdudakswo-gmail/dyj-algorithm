package baekjoon.p02303;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[][] inputs = new int[n][5];

        for (int i = 0; i < inputs.length; i++) {
            for (int j = 0; j < inputs[i].length; j++) {
                inputs[i][j] = sc.nextInt();
            }
        }

        System.out.println(solve(inputs));
    }

    private static int solve(int[][] inputs) {
        int[] arr = new int[inputs.length];

        for (int i = 0; i < arr.length; i++) {
            arr[i] = max(inputs[i]);
        }

        int max = -1;
        for (int e : arr) {
            max = Math.max(max, e);
        }

        for (int i = arr.length - 1; i >= 0; i--) {
            if (arr[i] == max) {
                return (i + 1);
            }
        }

        return -1;
    }

    private static int max(int[] arr) {
        int ret = -1;
        int len = arr.length;

        for (int i = 0; i < len; i++) {
            for (int j = i + 1; j < len; j++) {
                for (int k = j + 1; k < len; k++) {
                    int mod = (arr[i] + arr[j] + arr[k]) % 10;
                    ret = Math.max(ret, mod);
                }
            }
        }

        return ret;
    }

}