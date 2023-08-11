package baekjoon.p11008;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while (t-- > 0) {
            System.out.println(solve(sc.next(), sc.next()));
        }
    }

    private static int solve(String s, String p) {
        return s.replaceAll(p, " ").length();
    }

}