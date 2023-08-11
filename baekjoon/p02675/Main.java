package baekjoon.p02675;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        for (int i = 0; i < t; i++) {
            int r = sc.nextInt();
            String s = sc.next();

            String result = solve(r, s);
            System.out.println(result);
        }
    }

    private static String solve(int r, String s) {
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < s.length(); i++) {
            for (int j = 0; j < r; j++) {
                char ch = s.charAt(i);
                sb.append(ch);
            }
        }

        return sb.toString();
    }

}