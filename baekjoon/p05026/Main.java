package baekjoon.p05026;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        while (n-- > 0) {
            System.out.println(solve(sc.next()));
        }
    }

    private static String solve(String input) {
        if (input.contains("+")) {
            String[] inputs = input.split("\\+");
            int a = Integer.parseInt(inputs[0]);
            int b = Integer.parseInt(inputs[1]);
            return String.valueOf(a + b);
        } else {
            return "skipped";
        }
    }

}