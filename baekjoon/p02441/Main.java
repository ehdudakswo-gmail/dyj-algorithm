package baekjoon.p02441;

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
        int len = ret.length;

        for (int i = 0; i < len; i++) {
            int star = (len - i);
            int blank = i;
            ret[i] = solve2(blank, star);
        }

        return ret;
    }

    private static String solve2(int blank, int star) {
        StringBuilder sb = new StringBuilder();

        while (blank-- > 0) {
            sb.append(" ");
        }

        while (star-- > 0) {
            sb.append("*");
        }

        return sb.toString();
    }

}