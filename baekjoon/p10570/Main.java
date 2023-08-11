package baekjoon.p10570;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        while (n-- > 0) {
            int v = sc.nextInt();
            int[] inputs = new int[v];
            for (int i = 0; i < inputs.length; i++) {
                inputs[i] = sc.nextInt();
            }
            System.out.println(solve(inputs));
        }
    }

    private static int solve(int[] inputs) {
        int[] cnt = new int[1001];
        for (int e : inputs) {
            cnt[e]++;
        }

        int max = cnt[0];
        for (int e : cnt) {
            max = Math.max(max, e);
        }

        for (int i = 0; i < cnt.length; i++) {
            if (cnt[i] == max) {
                return i;
            }
        }

        return -1;
    }

}