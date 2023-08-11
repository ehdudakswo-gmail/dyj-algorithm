package baekjoon.p11654;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println(solve(sc.next()));
    }

    private static int solve(String input) {
        return (int) input.charAt(0);
    }

}