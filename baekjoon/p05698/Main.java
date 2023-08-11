package baekjoon.p05698;

import java.util.HashSet;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (true) {
            String input = sc.nextLine();
            if (input.equals("*")) break;
            System.out.println(solve(input));
        }
    }

    private static String solve(String input) {
        String[] arr = input.toLowerCase().split(" ");
        HashSet<String> set = new HashSet<>();

        for (String e : arr) {
            set.add(e.substring(0, 1));
        }

        if (set.size() == 1) {
            return "Y";
        } else {
            return "N";
        }
    }

}