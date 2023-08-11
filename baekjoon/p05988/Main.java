package baekjoon.p05988;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        while (n-- > 0) {
            System.out.println(solve(sc.next()));
        }
    }

    private static String solve(String k) {
        String lastStr = k.substring(k.length() - 1);
        int lastInt = Integer.parseInt(lastStr);

        if (lastInt % 2 == 0) {
            return "even";
        } else {
            return "odd";
        }
    }

}