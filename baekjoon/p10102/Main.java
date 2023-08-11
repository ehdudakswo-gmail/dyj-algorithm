package baekjoon.p10102;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println(solve(sc.nextInt(), sc.next()));
    }

    private static String solve(int v, String input) {
        int cnt = 0;

        for (int i = 0; i < input.length(); i++) {
            switch (input.charAt(i)) {
                case 'A':
                    cnt++;
                    break;
                case 'B':
                    cnt--;
                    break;
            }
        }

        if (cnt > 0) {
            return "A";
        } else if (cnt < 0) {
            return "B";
        } else {
            return "Tie";
        }
    }

}