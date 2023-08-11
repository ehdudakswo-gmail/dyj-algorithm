package baekjoon.p02965;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] inputs = {sc.nextInt(), sc.nextInt(), sc.nextInt()};
        System.out.println(solve(inputs));
    }

    private static int solve(int[] inputs) {
        int max = Math.max(inputs[1] - inputs[0], inputs[2] - inputs[1]);
        return max - 1;
    }

}