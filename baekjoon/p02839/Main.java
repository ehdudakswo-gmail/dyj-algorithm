package baekjoon.p02839;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println(solve(sc.nextInt()));
    }

    private static int solve(int input) {
        for (int i = input / 5; i >= 0; i--) {
            int r = (input - i * 5);
            if (r % 3 == 0) {
                return (i + r / 3);
            }
        }

        return -1;
    }

}