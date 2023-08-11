package baekjoon.p10163;

import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[][] inputs = new int[n][4];

        for (int i = 0; i < inputs.length; i++) {
            for (int j = 0; j < inputs[i].length; j++) {
                inputs[i][j] = sc.nextInt();
            }
        }

        for (int solve : solve(inputs)) {
            System.out.println(solve);
        }
    }

    private static int[] solve(int[][] inputs) {
        int[][] arr = new int[102][102];
        for (int i = 0; i < inputs.length; i++) {
            int x0 = inputs[i][0];
            int y0 = inputs[i][1];
            int w = inputs[i][2];
            int h = inputs[i][3];
            for (int j = y0; j < y0 + h; j++) {
                Arrays.fill(arr[j], x0, x0 + w, i + 1);
            }
        }

        int[] ret = new int[inputs.length];
        for (int i = 0; i < ret.length; i++) {
            ret[i] = count(arr, i + 1);
        }

        return ret;
    }

    private static int count(int[][] arr, int n) {
        int ret = 0;
        for (int[] e : arr) {
            for (int ee : e) {
                if (ee == n) {
                    ret++;
                }
            }
        }

        return ret;
    }

}