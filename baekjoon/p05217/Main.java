package baekjoon.p05217;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while (t-- > 0) {
            int n = sc.nextInt();
            System.out.println(String.format("Pairs for %d: %s", n, solve(n)));
        }
    }

    private static String solve(int n) {
        if (n <= 2) {
            return "";
        }

        List<int[]> list = new ArrayList<>();
        for (int i = 1, j = n - 1; i < j; i++, j--) {
            list.add(new int[]{i, j});
        }

        return string(list);
    }

    private static String string(List<int[]> list) {
        StringBuilder sb = new StringBuilder();

        for (int[] arr : list) {
            sb.append(arr[0]);
            sb.append(" ");
            sb.append(arr[1]);
            sb.append(", ");
        }
        sb.delete(sb.length() - 2, sb.length());

        return sb.toString();
    }

}