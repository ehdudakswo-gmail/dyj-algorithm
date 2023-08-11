package baekjoon.p09316;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        for (String solve : solve(sc.nextInt())) {
            System.out.println(solve);
        }
    }

    private static String[] solve(int input) {
        String[] ret = new String[input];
        for (int i = 0; i < ret.length; i++) {
            ret[i] = String.format("Hello World, Judge %d!", i + 1);
        }

        return ret;
    }

}