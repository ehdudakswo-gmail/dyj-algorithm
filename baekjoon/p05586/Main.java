package baekjoon.p05586;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        for (int solve : solve(sc.next())) {
            System.out.println(solve);
        }
    }

    private static int[] solve(String input) {
        int[] ret = new int[2];

        for (int i = 0; i <= input.length() - 3; i++) {
            switch (input.substring(i, i + 3)) {
                case "JOI":
                    ret[0]++;
                    break;
                case "IOI":
                    ret[1]++;
                    break;
            }
        }

        return ret;
    }

}