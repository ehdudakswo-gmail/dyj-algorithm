package baekjoon.p10162;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        for (int num : solve(sc.nextInt())) {
            System.out.print(num + " ");
        }
    }

    private static int[] solve(int t) {
        int[] ret = new int[3];

        ret[0] = (t / 300);
        t %= 300;

        ret[1] = (t / 60);
        t %= 60;

        ret[2] = (t / 10);
        t %= 10;

        if (t == 0) {
            return ret;
        } else {
            return new int[]{-1};
        }
    }

}