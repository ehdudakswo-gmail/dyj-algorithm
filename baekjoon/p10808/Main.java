package baekjoon.p10808;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        for (int solve : solve(sc.next())) {
            System.out.print(solve + " ");
        }
    }

    private static int[] solve(String input) {
        int[] ret = new int[26];

        for (char ch : input.toCharArray()) {
            int idx = ch - 'a';
            ret[idx]++;
        }

        return ret;
    }

}