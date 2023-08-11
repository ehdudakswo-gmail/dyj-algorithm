package baekjoon.p05575;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[][] inputs = new int[3][6];

        for (int i = 0; i < inputs.length; i++) {
            for (int j = 0; j < inputs[i].length; j++) {
                inputs[i][j] = sc.nextInt();
            }
        }

        for (int[] solve : solve(inputs)) {
            System.out.print(String.format("%d %d %d", solve[0], solve[1], solve[2]));
            System.out.println();
        }
    }

    private static int[][] solve(int[][] inputs) {
        int[][] ret = new int[3][3];

        for (int i = 0; i < inputs.length; i++) {
            int diff = (seconds(inputs[i][3], inputs[i][4], inputs[i][5]) - seconds(inputs[i][0], inputs[i][1], inputs[i][2]));
            ret[i][0] = diff / 3600;
            ret[i][1] = (diff % 3600) / 60;
            ret[i][2] = diff % 60;
        }

        return ret;
    }

    private static int seconds(int h, int m, int s) {
        return (3600 * h + 60 * m + s);
    }

}