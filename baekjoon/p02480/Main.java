package baekjoon.p02480;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        System.out.println(solve(a, b, c));
    }

    private static int solve(int a, int b, int c) {
        int[] arr = new int[7];
        arr[a]++;
        arr[b]++;
        arr[c]++;

        int max = 1;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 3) {
                return (10000 + i * 1000);
            }

            if (arr[i] == 2) {
                return (1000 + i * 100);
            }

            if (arr[i] == 1) {
                max = i;
            }
        }

        return (max * 100);
    }

}