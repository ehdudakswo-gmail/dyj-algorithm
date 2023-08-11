package baekjoon.p04447;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.nextLine();

        while (n-- > 0) {
            System.out.println(solve(sc.nextLine()));
        }
    }

    private static String solve(String input) {
        String lower = input.toLowerCase();
        int g = cnt(lower, 'g');
        int b = cnt(lower, 'b');

        if (g > b) {
            return input + " is GOOD";
        } else if (g < b) {
            return input + " is A BADDY";
        } else {
            return input + " is NEUTRAL";
        }
    }

    private static int cnt(String str, char target) {
        int ret = 0;
        for (char ch : str.toCharArray()) {
            if (ch == target) {
                ret++;
            }
        }

        return ret;
    }

}