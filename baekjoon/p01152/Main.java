package baekjoon.p01152;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println(solve(sc.nextLine().trim()));
    }

    private static int solve(String input) {
        if (input.isEmpty()) {
            return 0;
        } else {
            return input.split(" ").length;
        }
    }

}