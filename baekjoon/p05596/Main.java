package baekjoon.p05596;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[][] inputs = new int[2][4];

        for (int i = 0; i < inputs.length; i++) {
            for (int j = 0; j < inputs[i].length; j++) {
                inputs[i][j] = sc.nextInt();
            }
        }

        System.out.println(solve(inputs));
    }

    private static int solve(int[][] inputs) {
        return Math.max(sum(inputs[0]), sum(inputs[1]));
    }

    private static int sum(int[] list) {
        int ret = 0;

        for (int n : list) {
            ret += n;
        }

        return ret;
    }

}