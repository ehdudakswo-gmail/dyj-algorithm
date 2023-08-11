package baekjoon.p01145;

import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] inputs = new int[5];

        for (int i = 0; i < inputs.length; i++) {
            inputs[i] = sc.nextInt();
        }

        System.out.println(solve(inputs));
    }

    private static int solve(int[] inputs) {
        Arrays.sort(inputs);
        int n = inputs[0];

        while (true) {
            int cnt = 0;
            for (int e : inputs) {
                if (n % e == 0) {
                    cnt++;
                }
            }

            if (cnt >= 3) {
                break;
            }
            n++;
        }

        return n;
    }

}