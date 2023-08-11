package baekjoon.p05218;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while (t-- > 0) {
            System.out.print("Distances: ");
            for (int solve : solve(sc.next(), sc.next())) {
                System.out.print(solve + " ");
            }
            System.out.println();
        }
    }

    private static int[] solve(String input, String input2) {
        int[] ret = new int[input.length()];

        for (int i = 0; i < ret.length; i++) {
            char ch = input.charAt(i);
            char ch2 = input2.charAt(i);
            ret[i] = (ch2 - ch + 26) % 26;
        }

        return ret;
    }

}