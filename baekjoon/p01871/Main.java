package baekjoon.p01871;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        while (n-- > 0) {
            System.out.println(solve(sc.next()));
        }
    }

    private static String solve(String input) {
        String[] inputs = input.split("-");
        int a = num(inputs[0]);
        int b = Integer.parseInt(inputs[1]);

        if (Math.abs(a - b) <= 100) {
            return "nice";
        } else {
            return "not nice";
        }
    }

    private static int num(String str) {
        int ret = 0;
        int len = str.length();

        for (int i = 0; i < len; i++) {
            int n = str.charAt(i) - 'A';
            int radix = (int) Math.pow(26, len - i - 1);
            ret += (n * radix);
        }

        return ret;
    }

}