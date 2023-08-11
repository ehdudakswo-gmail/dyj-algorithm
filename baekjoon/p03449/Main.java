package baekjoon.p03449;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while (t-- > 0) {
            int solve = solve(sc.next(), sc.next());
            System.out.println(String.format("Hamming distance is %d.", solve));
        }
    }

    private static int solve(String a, String b) {
        int ret = 0;

        for (int i = 0; i < a.length(); i++) {
            if (a.charAt(i) != b.charAt(i)) {
                ret++;
            }
        }

        return ret;
    }

}