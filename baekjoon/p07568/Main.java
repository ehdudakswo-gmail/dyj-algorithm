package baekjoon.p07568;

import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[][] inputs = new int[n][2];

        for (int i = 0; i < inputs.length; i++) {
            for (int j = 0; j < inputs[i].length; j++) {
                inputs[i][j] = sc.nextInt();
            }
        }

        for (int solve : solve(inputs)) {
            System.out.print(solve + " ");
        }
    }

    private static int[] solve(int[][] inputs) {
        int n = inputs.length;
        int[] ret = new int[n];
        Arrays.fill(ret, 1);

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (inputs[i][0] > inputs[j][0] && inputs[i][1] > inputs[j][1]) {
                    ret[j]++;
                }
            }
        }

        return ret;
    }

}