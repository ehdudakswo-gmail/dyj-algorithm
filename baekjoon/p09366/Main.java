package baekjoon.p09366;

import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        for (int i = 1; i <= t; i++) {
            String solve = solve(sc.nextInt(), sc.nextInt(), sc.nextInt());
            System.out.println(String.format("Case #%d: %s", i, solve));
        }
    }

    private static String solve(int a, int b, int c) {
        int[] arr = {a, b, c};
        Arrays.sort(arr);

        if (arr[0] + arr[1] <= arr[2]) {
            return "invalid!";
        } else if (arr[0] == arr[2]) {
            return "equilateral";
        } else if (arr[0] == arr[1] || arr[1] == arr[2]) {
            return "isosceles";
        } else {
            return "scalene";
        }
    }

}