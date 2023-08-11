package baekjoon.p02998;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println(solve(sc.next()));
    }

    private static String solve(String input) {
        StringBuilder sb = new StringBuilder();
        String binary3 = binary(input, 3);

        for (int i = 0; i < binary3.length(); i += 3) {
            String binary = binary3.substring(i, i + 3);
            String oct = Integer.toOctalString(Integer.parseInt(binary, 2));
            sb.append(oct);
        }

        return sb.toString();
    }

    private static String binary(String str, int digit) {
        int mod = str.length() % digit;
        int cnt = digit - mod;

        if (mod == 0) {
            return str;
        } else {
            return repeat("0", cnt) + str;
        }
    }

    private static String repeat(String str, int cnt) {
        StringBuilder sb = new StringBuilder();
        while (cnt-- > 0) {
            sb.append(str);
        }

        return sb.toString();
    }

}