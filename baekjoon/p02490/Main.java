package baekjoon.p02490;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = 3;

        while (t-- > 0) {
            int[] inputs = new int[4];
            for (int i = 0; i < inputs.length; i++) {
                inputs[i] = sc.nextInt();
            }

            System.out.println(solve(inputs));
        }
    }

    private static String solve(int[] inputs) {
        switch (cnt(inputs, 0)) {
            case 1:
                return "A";
            case 2:
                return "B";
            case 3:
                return "C";
            case 4:
                return "D";
            default:
                return "E";
        }
    }

    private static int cnt(int[] inputs, int num) {
        int cnt = 0;

        for (int input : inputs) {
            if (input == num) {
                cnt++;
            }
        }

        return cnt;
    }

}