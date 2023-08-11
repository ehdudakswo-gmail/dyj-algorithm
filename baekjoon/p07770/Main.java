package baekjoon.p07770;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(solve(n));
    }

    private static int solve(int n) {
        int height = 0;
        int block = 1;
        int add = 4;
        int under = 1;

        while (block <= n) {
            height++;
            under += add;
            add += 4;
            block += under;
        }

        return height;
    }
}