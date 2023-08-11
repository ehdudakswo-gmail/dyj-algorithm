package baekjoon.p05073;

import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (true) {
            int a = sc.nextInt();
            int b = sc.nextInt();
            int c = sc.nextInt();
            if (a == 0 && b == 0 && c == 0) {
                break;
            }

            System.out.println(solve(a, b, c));
        }
    }

    private static String solve(int a, int b, int c) {
        int[] arr = {a, b, c};
        Arrays.sort(arr);

        if (arr[0] + arr[1] > arr[2]) {
            if (arr[0] == arr[2]) {
                return "Equilateral";
            } else if (arr[0] == arr[1] || arr[1] == arr[2]) {
                return "Isosceles";
            } else {
                return "Scalene";
            }
        } else {
            return "Invalid";
        }
    }

}