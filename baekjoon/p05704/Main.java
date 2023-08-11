package baekjoon.p05704;

import java.util.HashSet;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (true) {
            String input = sc.nextLine();
            if (input.equals("*")) {
                break;
            }

            System.out.println(solve(input));
        }
    }

    private static String solve(String input) {
        HashSet<Character> hashSet = new HashSet<>();
        for (char ch : input.toCharArray()) {
            if (ch == ' ') {
                continue;
            }

            hashSet.add(ch);
        }

        if (hashSet.size() == 26) {
            return "Y";
        } else {
            return "N";
        }
    }

}