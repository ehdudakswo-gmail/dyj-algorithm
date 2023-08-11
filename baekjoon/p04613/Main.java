package baekjoon.p04613;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (true) {
            String input = sc.nextLine();
            if (input.equals("#")) {
                break;
            }

            System.out.println(solve(input));
        }
    }

    private static int solve(String input) {
        int ret = 0;

        for (int i = 0; i < input.length(); i++) {
            char ch = input.charAt(i);
            if (ch >= 'A' && ch <= 'Z') {
                int n = ch - 'A' + 1;
                ret += (i + 1) * n;
            }
        }

        return ret;
    }

}