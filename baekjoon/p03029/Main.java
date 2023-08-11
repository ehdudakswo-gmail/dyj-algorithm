package baekjoon.p03029;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println(solve(sc.next(), sc.next()));
    }

    private static String solve(String a, String b) {
        int[] aa = intArray(a.split(":"));
        int[] bb = intArray(b.split(":"));

        int aaa = aa[0] * 3600 + aa[1] * 60 + aa[2];
        int bbb = bb[0] * 3600 + bb[1] * 60 + bb[2];

        int mod = 3600 * 24;
        int diff = (bbb - aaa + mod) % mod;
        if (diff == 0) {
            return "24:00:00";
        }

        int h = diff / 3600;
        int m = (diff % 3600) / 60;
        int s = diff % 60;

        return String.format("%02d:%02d:%02d", h, m, s);
    }

    private static int[] intArray(String[] inputs) {
        int[] ret = new int[inputs.length];
        for (int i = 0; i < ret.length; i++) {
            ret[i] = Integer.parseInt(inputs[i]);
        }

        return ret;
    }

}