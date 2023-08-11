package baekjoon.p05363;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.nextLine();

        while (n-- > 0) {
            System.out.println(solve(sc.nextLine()));
        }
    }

    private static String solve(String input) {
        StringBuilder sb = new StringBuilder();
        String[] inputs = input.split(" ");

        for (int i = 2; i < inputs.length; i++) {
            sb.append(inputs[i]);
            sb.append(" ");
        }

        for (int i = 0; i < 2; i++) {
            sb.append(inputs[i]);
            sb.append(" ");
        }

        return sb.toString();
    }

}