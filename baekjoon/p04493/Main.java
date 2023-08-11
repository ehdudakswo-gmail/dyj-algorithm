package baekjoon.p04493;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while (t-- > 0) {
            int n = sc.nextInt();
            char[][] inputs = new char[n][2];

            for (int i = 0; i < inputs.length; i++) {
                for (int j = 0; j < inputs[0].length; j++) {
                    inputs[i][j] = sc.next().charAt(0);
                }
            }

            System.out.println(solve(inputs));
        }
    }

    private static String solve(char[][] inputs) {
        int[] win = new int[2];

        for (char[] input : inputs) {
            if (input[0] == input[1]) {
                continue;
            }

            if (win(input[0], input[1])) {
                win[0]++;
            } else {
                win[1]++;
            }
        }

        if (win[0] > win[1]) {
            return "Player 1";
        } else if (win[0] < win[1]) {
            return "Player 2";
        } else {
            return "TIE";
        }
    }

    private static boolean win(char a, char b) {
        switch (a) {
            case 'R':
                return (b == 'S');
            case 'P':
                return (b == 'R');
            case 'S':
                return (b == 'P');
            default:
                return false;
        }
    }

}