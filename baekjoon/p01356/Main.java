package baekjoon.p01356;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println(solve(sc.nextInt()));
    }

    private static String solve(int input) {
        String str = String.valueOf(input);
        int len = str.length();

        for (int i = 1; i < len; i++) {
            String a = str.substring(0, i);
            String b = str.substring(i, len);
            if (mul(a) == mul(b)) {
                return "YES";
            }
        }

        return "NO";
    }

    private static int mul(String str) {
        int ret = 1;
        for (char ch : str.toCharArray()) {
            ret *= (ch - '0');
        }

        return ret;
    }

}