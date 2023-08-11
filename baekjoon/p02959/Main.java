package baekjoon.p02959;

import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println(solve(sc.nextInt(), sc.nextInt(), sc.nextInt(), sc.nextInt()));
    }

    private static int solve(int a, int b, int c, int d) {
        int[] arr = {a, b, c, d};
        Arrays.sort(arr);

        return (arr[0] * arr[2]);
    }

}
