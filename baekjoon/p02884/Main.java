package baekjoon.p02884;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] ret = solve(sc.nextInt(), sc.nextInt());
        System.out.println(ret[0] + " " + ret[1]);
    }

    private static int[] solve(int h, int m) {
        int[] ret = new int[2];

        int totalM = h * 60 + m;
        int retM = totalM - 45;

        if (retM < 0) {
            retM += (24 * 60);
        }

        ret[0] = retM / 60;
        ret[1] = retM % 60;
        return ret;
    }

}