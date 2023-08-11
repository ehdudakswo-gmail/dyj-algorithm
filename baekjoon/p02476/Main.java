package baekjoon.p02476;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int ret = 0;

        while (n-- > 0) {
            ret = Math.max(ret, solve(sc.nextInt(), sc.nextInt(), sc.nextInt()));
        }

        System.out.println(ret);
    }

    private static int solve(int... input) {
        int[] arr = new int[7];
        arr[input[0]]++;
        arr[input[1]]++;
        arr[input[2]]++;

        int max = 0;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 3) {
                return 10000 + (i * 1000);
            }

            if (arr[i] == 2) {
                return 1000 + (i * 100);
            }

            if (arr[i] == 1) {
                max = i;
            }
        }

        return (max * 100);
    }

}