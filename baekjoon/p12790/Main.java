package baekjoon.p12790;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int[] inputs = new int[8];
            for (int i = 0; i < inputs.length; i++) {
                inputs[i] = sc.nextInt();
            }
            System.out.println(solve(inputs));
        }
    }

    private static int solve(int[] inputs) {
        int a = inputs[0] + inputs[4];
        int b = inputs[1] + inputs[5];
        int c = inputs[2] + inputs[6];
        int d = inputs[3] + inputs[7];

        if (a < 1) a = 1;
        if (b < 1) b = 1;
        if (c < 0) c = 0;

        return (a + 5 * b + 2 * c + 2 * d);
    }

}
