package baekjoon.p10809;

import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        for (int solve : solve(sc.next())) {
            System.out.print(solve + " ");
        }
    }

    private static int[] solve(String str) {
        int[] ret = new int[26];
        Arrays.fill(ret, -1);

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            int idx = ch - 'a';

            if (ret[idx] == -1) {
                ret[idx] = i;
            }
        }

        return ret;
    }

}