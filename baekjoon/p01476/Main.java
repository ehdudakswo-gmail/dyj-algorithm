package baekjoon.p01476;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println(solve(sc.nextInt(), sc.nextInt(), sc.nextInt()));
    }

    private static int solve(int e, int s, int m) {
        int ret = 1;

        while (true) {
            int a = (ret - e) % 15;
            int b = (ret - s) % 28;
            int c = (ret - m) % 19;
            if (a == 0 && b == 0 && c == 0) {
                break;
            }
            ret++;
        }

        return ret;
    }

}