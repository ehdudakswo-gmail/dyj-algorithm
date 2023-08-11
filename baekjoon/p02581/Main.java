package baekjoon.p02581;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

//        int[] solve = solve(sc.nextInt(), sc.nextInt());
        int[] solve2 = solve2(sc.nextInt(), sc.nextInt());

        for (int ret : solve2) {
            System.out.println(ret);
        }
    }

    private static int[] solve(int m, int n) {
        int[] ret = new int[2];
        List<Integer> list = new ArrayList<>();

        for (int i = m; i <= n; i++) {
            if (isPrime(i)) {
                list.add(i);
            }
        }

        if (list.size() == 0) {
            return new int[]{-1};
        }

        ret[0] = sum(list);
        ret[1] = list.get(0);

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

    private static int sum(List<Integer> list) {
        int ret = 0;

        for (int n : list) {
            ret += n;
        }

        return ret;
    }

    private static int[] solve2(int m, int n) {
        int[] ret = new int[2];
        List<Integer> list = new ArrayList<>();
        boolean[] prime = new boolean[n + 1];
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

        for (int i = m; i <= n; i++) {
            if (prime[i]) {
                list.add(i);
            }
        }

        if (list.size() == 0) {
            return new int[]{-1};
        }

        ret[0] = sum(list);
        ret[1] = list.get(0);

        return ret;
    }

}