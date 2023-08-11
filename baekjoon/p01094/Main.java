package baekjoon.p01094;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println(solve(sc.nextInt()));
    }

    private static int solve(int n) {
        int ret = 0;
        for (char ch : Integer.toBinaryString(n).toCharArray()) {
            if (ch == '1') {
                ret++;
            }
        }

        return ret;
    }

}