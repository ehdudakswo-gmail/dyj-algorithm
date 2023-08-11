package baekjoon.p02902;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println(solve(sc.next()));
    }

    private static String solve(String input) {
        StringBuilder sb = new StringBuilder();
        String[] inputs = input.split("-");

        for (String str : inputs) {
            sb.append(str.charAt(0));
        }

        return sb.toString();
    }

}