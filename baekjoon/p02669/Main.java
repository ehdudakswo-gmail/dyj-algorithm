package baekjoon.p02669;

import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[][] inputs = new int[4][4];

        for (int i = 0; i < inputs.length; i++) {
            for (int j = 0; j < inputs[i].length; j++) {
                inputs[i][j] = sc.nextInt();
            }
        }

        System.out.println(solve(inputs));
    }

    private static int solve(int[][] inputs) {
        boolean[][] arr = new boolean[101][101];

        for (int[] input : inputs) {
            int x1 = input[0];
            int y1 = input[1];
            int x2 = input[2];
            int y2 = input[3];

            for (int y = y1; y < y2; y++) {
                Arrays.fill(arr[y], x1, x2, true);
            }
        }

        int ret = 0;
        for (boolean[] e : arr) {
            for (boolean ee : e) {
                if (ee) {
                    ret++;
                }
            }
        }

        return ret;
    }

}