package baekjoon.p01100;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char[][] inputs = new char[8][8];

        for (int i = 0; i < inputs.length; i++) {
            String input = sc.next();
            for (int j = 0; j < input.length(); j++) {
                inputs[i][j] = input.charAt(j);
            }
        }

        System.out.println(solve(inputs));
    }

    private static int solve(char[][] inputs) {
        int ret = 0;

        for (int i = 0; i < inputs.length; i++) {
            for (int j = 0; j < inputs[i].length; j++) {
                if (inputs[i][j] == 'F' && isWhite(i, j)) {
                    ret++;
                }
            }
        }

        return ret;
    }

    private static boolean isWhite(int i, int j) {
        if (i % 2 == 0) {
            return (j % 2 == 0);
        } else {
            return (j % 2 == 1);
        }
    }

}