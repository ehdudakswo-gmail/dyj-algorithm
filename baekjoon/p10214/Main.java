package baekjoon.p10214;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while (t-- > 0) {
            int[][] inputs = new int[9][2];
            for (int i = 0; i < inputs.length; i++) {
                inputs[i][0] = sc.nextInt();
                inputs[i][1] = sc.nextInt();
            }

            System.out.println(solve(inputs));
        }
    }

    private static String solve(int[][] inputs) {
        int[] score = new int[2];

        for (int[] input : inputs) {
            score[0] += input[0];
            score[1] += input[1];
        }

        if (score[0] > score[1]) {
            return "Yonsei";
        } else if (score[0] < score[1]) {
            return "Korea";
        } else {
            return "Draw";
        }
    }

}