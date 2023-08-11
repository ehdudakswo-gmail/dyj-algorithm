package baekjoon.p01357;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println(solve(sc.nextInt(), sc.nextInt()));
    }

    private static int solve(int x, int y) {
        return rev(rev(x) + rev(y));
    }

    private static int rev(int n) {
        StringBuilder sb = new StringBuilder();
        sb.append(String.valueOf(n));
        sb.reverse();

        return Integer.parseInt(sb.toString());
    }

}
