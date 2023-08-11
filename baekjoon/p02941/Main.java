package baekjoon.p02941;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println(solve(sc.next()));
    }

    private static int solve(String input) {
        String[] arr = {"c=", "c-", "dz=", "d-", "lj", "nj", "s=", "z="};
        String str = input;
        int ret = 0;

        while (str.length() > 0) {
            str = str.substring(startWith(str, arr).length());
            ret++;
        }

        return ret;
    }

    private static String startWith(String str, String[] arr) {
        for (String s : arr) {
            if (str.startsWith(s)) {
                return s;
            }
        }

        return " ";
    }

}