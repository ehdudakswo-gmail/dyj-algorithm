package baekjoon.p01855;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println(solve(sc.nextInt(), sc.next()));
    }

    private static String solve(int k, String str) {
        int x = k;
        int y = str.length() / k;
        char[][] arr = new char[y][x];

        int seq = 0;
        for (int i = 0; i < y; i++) {
            for (int j = 0; j < x; j++) {
                arr[i][j] = str.charAt(seq++);
            }
            if (i % 2 == 1) {
                reverse(arr[i]);
            }
        }

        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < x; i++) {
            for (int j = 0; j < y; j++) {
                sb.append(arr[j][i]);
            }
        }

        return sb.toString();
    }

    private static void reverse(char[] arr) {
        int a = 0;
        int b = arr.length - 1;

        while (a <= b) {
            char temp = arr[a];
            arr[a] = arr[b];
            arr[b] = temp;
            a++;
            b--;
        }
    }

}