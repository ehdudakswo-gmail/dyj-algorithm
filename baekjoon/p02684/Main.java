package baekjoon.p02684;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int p = sc.nextInt();

        while (p-- > 0) {
            for (int solve : solve(sc.next())) {
                System.out.print(solve + " ");
            }
            System.out.println();
        }
    }

    private static int[] solve(String input) {
        String[] set = {"TTT", "TTH", "THT", "THH", "HTT", "HTH", "HHT", "HHH"};
        int[] ret = new int[set.length];

        for (int i = 0; i < set.length; i++) {
            ret[i] = cnt(input, set[i]);
        }

        return ret;
    }

    private static int cnt(String str, String target) {
        int ret = 0;
        int targetLen = target.length();

        for (int i = 0; i <= str.length() - targetLen; i++) {
            if (str.substring(i, i + targetLen).equals(target)) {
                ret++;
            }
        }

        return ret;
    }

}