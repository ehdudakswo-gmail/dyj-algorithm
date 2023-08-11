package baekjoon.p01755;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Integer[] solve = solve(sc.nextInt(), sc.nextInt());

        for (int i = 0; i < solve.length; i++) {
            System.out.print(solve[i] + " ");
            if (i % 10 == 9) {
                System.out.println();
            }
        }
    }

    private static Integer[] solve(int m, int n) {
        Integer[] arr = new Integer[n - m + 1];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = (m + i);
        }

        Arrays.sort(arr, new Comparator<Integer>() {
            @Override
            public int compare(Integer a, Integer b) {
                return string(a).compareTo(string(b));
            }
        });

        return arr;
    }

    private static String string(int n) {
        String[] set = new String[]{"zero", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine"};
        StringBuilder sb = new StringBuilder();

        for (char ch : String.valueOf(n).toCharArray()) {
            sb.append(set[ch - '0']);
            sb.append(" ");
        }

        return sb.toString();
    }

}