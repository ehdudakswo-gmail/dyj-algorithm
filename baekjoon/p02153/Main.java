package baekjoon.p02153;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println(solve(sc.next()));
    }

    private static String solve(String input) {
        int sum = 0;
        for (char ch : input.toCharArray()) {
            if (ch >= 'a' && ch <= 'z') {
                sum += (ch - 'a' + 1);
            } else {
                sum += (ch - 'A' + 27);
            }
        }

        if (prime(sum)) {
            return "It is a prime word.";
        } else {
            return "It is not a prime word.";
        }
    }

    private static boolean prime(int n) {
        for (int i = 2; i < n; i++) {
            if (n % i == 0) {
                return false;
            }
        }

        return true;
    }

}