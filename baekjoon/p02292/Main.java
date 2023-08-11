package baekjoon.p02292;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println(solve(sc.nextInt()));
    }

    private static int solve(int n) {
        int cnt = 0;
        int next = 1;
        int add = 1;

        while (n >= next) {
            next += add;
            cnt++;
            add = cnt * 6;
        }

        return cnt;
    }

}