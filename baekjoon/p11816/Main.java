package baekjoon.p11816;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println(solve(sc.next()));
    }

    private static int solve(String input) {
        if (input.charAt(0) == '0') {
            if (input.charAt(1) == 'x') {
                return Integer.parseInt(input.substring(2), 16);
            } else {
                return Integer.parseInt(input.substring(1), 8);
            }
        } else {
            return Integer.parseInt(input, 10);
        }
    }

}