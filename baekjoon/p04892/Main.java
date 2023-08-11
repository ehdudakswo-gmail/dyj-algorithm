package baekjoon.p04892;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = 1;

        while (true) {
            int input = sc.nextInt();
            if (input == 0) break;
            String[] solves = solve(input);
            System.out.println(String.format("%d. %s %s", t, solves[0], solves[1]));
            t++;
        }
    }

    private static String[] solve(int n) {
        int n1 = 3 * n;
        int n2;
        String ret;

        if (n1 % 2 == 0) {
            n2 = n1 / 2;
            ret = "even";
        } else {
            n2 = (n1 + 1) / 2;
            ret = "odd";
        }

        int n3 = n2 * 3;
        int n4 = n3 / 9;

        return new String[]{
                ret,
                String.valueOf(n4)
        };
    }

}