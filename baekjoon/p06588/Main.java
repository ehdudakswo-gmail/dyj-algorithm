package baekjoon.p06588;

import java.util.Arrays;
import java.util.Scanner;

public class Main {

    private static final int MAX = 1000000;
    private static boolean[] prime = new boolean[MAX + 1];

    public static void main(String[] args) {
        setPrime();
        Scanner sc = new Scanner(System.in);

        while (true) {
            int input = sc.nextInt();
            if (input == 0) break;
            System.out.println(solve(input));
        }
    }

    private static void setPrime() {
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

    private static String solve(int n) {
        int a = -1;
        for (int i = 3; i <= n / 2; i += 2) {
            if (prime[i] && prime[n - i]) {
                a = i;
                break;
            }
        }

        if (a == -1) {
            return "Goldbach's conjecture is wrong.";
        } else {
            return String.format("%d = %d + %d", n, a, n - a);
        }
    }

}