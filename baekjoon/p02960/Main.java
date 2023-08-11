package baekjoon.p02960;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println(solve(sc.nextInt(), sc.nextInt()));
    }

    private static int solve(int n, int k) {
        boolean[] prime = new boolean[n + 1];
        Arrays.fill(prime, true);
        prime[0] = false;
        prime[1] = false;

        List<Integer> list = new ArrayList<>();
        for (int i = 2; i <= n; i++) {
            if (prime[i]) {
                list.add(i);
                for (int j = i * i; j <= n; j += i) {
                    if (prime[j]) {
                        prime[j] = false;
                        list.add(j);
                    }
                }
            }
        }

        return list.get(k - 1);
    }

}