package baekjoon.p04948;

import java.util.Arrays;
import java.util.Scanner;

public class Main {

    private static final int MAX = 123456 * 2;
    private static boolean[] prime = new boolean[MAX + 1];

    public static void main(String[] args) {
        prime();
        Scanner sc = new Scanner(System.in);

        while (true) {
            int input = sc.nextInt();
            if (input == 0) break;
            System.out.println(solve(input));
        }
    }

    private static void prime() {
        Arrays.fill(prime, true);
        prime[0] = false;
        prime[1] = false;

        for (int i = 2; i * i <= MAX; i++) {
            if (prime[i]) {
                for (int j = i * i; j <= MAX; j += i) {
                    prime[j] = false;
                }
            }
        }
    }

    private static int solve(int n) {
        int ret = 0;
        for (int i = n + 1; i <= 2 * n; i++) {
            if (prime[i]) {
                ret++;
            }
        }

        return ret;
    }

}