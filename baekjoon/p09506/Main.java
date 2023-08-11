package baekjoon.p09506;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while (true) {
            int n = sc.nextInt();
            if (n == -1) {
                break;
            }

            System.out.println(solve(n));
        }
    }

    private static String solve(int n) {
        List<Integer> list = new ArrayList<>();

        for (int i = 1; i < n; i++) {
            if (n % i == 0) {
                list.add(i);
            }
        }

        int sum = 0;
        for (int num : list) {
            sum += num;
        }

        if (sum == n) {
            return solve(n, list);
        } else {
            return (n + " is NOT perfect.");
        }
    }

    private static String solve(int n, List<Integer> list) {
        StringBuilder sb = new StringBuilder();

        sb.append(n);
        sb.append(" = ");

        for (int i = 0; i < list.size(); i++) {
            sb.append(list.get(i));
            sb.append(" + ");
        }

        sb.delete(sb.length() - 3, sb.length());

        return sb.toString();
    }

}