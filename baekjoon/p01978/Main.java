package baekjoon.p01978;

import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] inputs = new int[n];

        for (int i = 0; i < inputs.length; i++) {
            inputs[i] = sc.nextInt();
        }

//        System.out.println(solve(inputs));
        System.out.println(solve2(inputs));
    }

    private static int solve(int[] inputs) {
        int ret = 0;

        for (int input : inputs) {
            if (isPrime(input)) {
                ret++;
            }
        }

        return ret;
    }

    private static boolean isPrime(int n) {
        if (n <= 1) {
            return false;
        }

        for (int i = 2; i < n; i++) {
            if (n % i == 0) {
                return false;
            }
        }

        return true;
    }

    private static int solve2(int[] inputs) {
        int ret = 0;
        boolean[] prime = new boolean[1001];
        Arrays.fill(prime, true);

        prime[0] = false;
        prime[1] = false;

        for (int i = 2; i < prime.length; i++) {
            if (prime[i]) {
                for (int j = i * 2; j < prime.length; j += i) {
                    prime[j] = false;
                }
            }
        }

        for (int input : inputs) {
            if (prime[input]) {
                ret++;
            }
        }

        return ret;
    }

}