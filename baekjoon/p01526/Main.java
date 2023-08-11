package baekjoon.p01526;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println(solve(sc.nextInt()));
    }

    private static int solve(int n) {
        for (int i = n; i >= 4; i--) {
            if (check(i)) {
                return i;
            }
        }

        return -1;
    }

    private static boolean check(int n) {
        for (char ch : String.valueOf(n).toCharArray()) {
            if (ch != '4' && ch != '7') {
                return false;
            }
        }

        return true;
    }

}