package baekjoon.p02163;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();

        System.out.println(new P02163().solve(n, m));
    }

}

class P02163 {

    public int solve(int n, int m) {
        return (n - 1) + (n * (m - 1));
    }

}