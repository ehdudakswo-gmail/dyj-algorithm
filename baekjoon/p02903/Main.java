package baekjoon.p02903;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println(solve(sc.nextInt()));
    }

    private static int solve(int n) {
        int x = 2;
        while (n-- > 0) {
            x = (x * 2 - 1);
        }

        return (x * x);
    }

}
