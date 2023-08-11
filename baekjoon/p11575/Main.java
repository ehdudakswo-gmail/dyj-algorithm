package baekjoon.p11575;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while (t-- > 0) {
            System.out.println(solve(sc.nextInt(), sc.nextInt(), sc.next()));
        }
    }

    private static String solve(int a, int b, String str) {
        StringBuilder sb = new StringBuilder();

        for (char ch : str.toCharArray()) {
            int x = ch - 'A';
            int n = (a * x + b) % 26;
            sb.append((char) (n + 'A'));
        }

        return sb.toString();
    }

}