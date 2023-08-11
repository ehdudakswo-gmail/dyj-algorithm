package baekjoon.p04564;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (true) {
            int input = sc.nextInt();
            if (input == 0) break;
            for (int solve : solve(input)) {
                System.out.print(solve + " ");
            }
            System.out.println();
        }
    }

    private static List<Integer> solve(int input) {
        int n = input;
        List<Integer> ret = new ArrayList<>();

        while (n >= 10) {
            ret.add(n);
            n = mul(n);
        }
        ret.add(n);

        return ret;
    }

    private static int mul(int n) {
        int ret = 1;

        while (n != 0) {
            ret *= (n % 10);
            n /= 10;
        }

        return ret;
    }

}