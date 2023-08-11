package baekjoon.p05063;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while (t-- > 0) {
            System.out.println(
                    solve(sc.nextInt(), sc.nextInt(), sc.nextInt())
            );
        }
    }

    private static String solve(int... input) {
        int diff = input[0] - (input[1] - input[2]);
        if (diff < 0) {
            return "advertise";
        } else if (diff > 0) {
            return "do not advertise";
        } else {
            return "does not matter";
        }
    }

}