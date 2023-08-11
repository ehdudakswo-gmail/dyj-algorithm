package baekjoon.p02711;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while (t-- > 0) {
            int input = sc.nextInt();
            String input2 = sc.next();
            System.out.println(solve(input, input2));
        }
    }

    private static String solve(int input, String input2) {
        int idx = input - 1;
        StringBuilder sb = new StringBuilder(input2);

        sb.deleteCharAt(idx);
        return sb.toString();
    }

}