package baekjoon.p08958;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while (t-- > 0) {
            System.out.println(solve(sc.next()));
        }
    }

    private static int solve(String input) {
        int ret = 0;
        int score = 0;

        for (int i = 0; i < input.length(); i++) {
            if (input.charAt(i) == 'O') {
                score++;
                ret += score;
            } else {
                score = 0;
            }
        }

        return ret;
    }

}