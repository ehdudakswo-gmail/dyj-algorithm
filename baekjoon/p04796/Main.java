package baekjoon.p04796;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int i = 1;

        while (true) {
            int l = sc.nextInt();
            int p = sc.nextInt();
            int v = sc.nextInt();
            if (l == 0 && p == 0 && v == 0) {
                break;
            }

            int solve = solve(l, p, v);
            System.out.println(String.format("Case %d: %d", i++, solve));
        }
    }

    private static int solve(int l, int p, int v) {
        int ret = 0;

        ret += (v / p) * l;
        ret += Math.min(v % p, l);

        return ret;
    }

}