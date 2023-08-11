package baekjoon.p01212;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println(solve(sc.next()));
    }

    private static String solve(String input) {
        String[] set = {"000", "001", "010", "011", "100", "101", "110", "111"};
        StringBuilder sb = new StringBuilder();

        for (char ch : input.toCharArray()) {
            sb.append(set[ch - '0']);
        }

        String ret = sb.toString();
        while (ret.charAt(0) == '0' && ret.length() > 1) {
            ret = ret.substring(1);
        }

        return ret;
    }

}