package baekjoon.p07510;

import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        for (int i = 1; i <= n; i++) {
            String solve = solve(sc.nextInt(), sc.nextInt(), sc.nextInt());
            System.out.println(String.format("Scenario #%d:\n%s\n", i, solve));
        }
    }

    private static String solve(int a, int b, int c) {
        int[] arr = {a, b, c};
        Arrays.sort(arr);

        if (arr[0] * arr[0] + arr[1] * arr[1] == arr[2] * arr[2]) {
            return "yes";
        } else {
            return "no";
        }
    }

}