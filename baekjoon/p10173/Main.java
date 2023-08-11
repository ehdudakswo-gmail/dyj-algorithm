package baekjoon.p10173;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (true) {
            String input = sc.nextLine();
            if (input.equals("EOI")) {
                break;
            }

            System.out.println(solve(input));
        }
    }

    private static String solve(String input) {
        if (input.toUpperCase().contains("NEMO")) {
            return "Found";
        } else {
            return "Missing";
        }
    }

}