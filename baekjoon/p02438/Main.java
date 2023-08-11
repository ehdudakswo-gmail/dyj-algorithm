package baekjoon.p02438;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        for (String ret : solve(sc.nextInt())) {
            System.out.println(ret);
        }
    }

    private static String[] solve(int n) {
        String[] ret = new String[n];

        for (int i = 0; i < ret.length; i++) {
            ret[i] = star(i + 1);
        }

        return ret;
    }

    private static String star(int cnt) {
        StringBuilder sb = new StringBuilder();

        while (cnt-- > 0) {
            sb.append("*");
        }

        return sb.toString();
    }

}