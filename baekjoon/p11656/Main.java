package baekjoon.p11656;

import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        for (String solve : solve(sc.next())) {
            System.out.println(solve);
        }
    }

    private static String[] solve(String input) {
        String[] ret = new String[input.length()];

        for (int i = 0; i < ret.length; i++) {
            ret[i] = input.substring(i, ret.length);
        }

        Arrays.sort(ret);
        return ret;
    }

}