package baekjoon.p10953;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while (t-- > 0) {
            String[] inputs = sc.next().split(",");
            int a = Integer.parseInt(inputs[0]);
            int b = Integer.parseInt(inputs[1]);
            System.out.println(solve(a, b));
        }
    }

    private static int solve(int a, int b) {
        return (a + b);
    }

}