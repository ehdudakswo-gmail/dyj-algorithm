package baekjoon.p11720;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println(solve(sc.nextInt(), sc.next()));
    }

    private static int solve(int n, String str) {
        int ret = 0;

        for (char ch : str.toCharArray()) {
            ret += (ch - '0');
        }

        return ret;
    }

}