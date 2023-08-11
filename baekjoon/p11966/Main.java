package baekjoon.p11966;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println(solve(sc.nextInt()));
    }

    private static int solve(int input) {
        switch (cnt(Integer.toBinaryString(input), '1')) {
            case 1:
                return 1;
            default:
                return 0;
        }
    }

    private static int cnt(String str, char target) {
        int ret = 0;
        for (char ch : str.toCharArray()) {
            if (ch == target) {
                ret++;
            }
        }

        return ret;
    }

}