package baekjoon.p12756;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[][] inputs = new int[2][2];

        for (int i = 0; i < inputs.length; i++) {
            for (int j = 0; j < inputs[i].length; j++) {
                inputs[i][j] = sc.nextInt();
            }
        }

        System.out.println(solve(inputs));
    }

    private static String solve(int[][] arr) {
        while (arr[0][1] > 0 && arr[1][1] > 0) {
            arr[0][1] -= arr[1][0];
            arr[1][1] -= arr[0][0];
        }

        if (arr[0][1] <= 0 && arr[1][1] <= 0) {
            return "DRAW";
        } else if (arr[1][1] <= 0) {
            return "PLAYER A";
        } else {
            return "PLAYER B";
        }
    }

}