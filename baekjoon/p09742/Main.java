package baekjoon.p09742;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()) {
            System.out.println(solve(sc.next(), sc.nextInt()));
        }
    }

    private static String solve(String input, int n) {
        char[] arr = input.toCharArray();
        Arrays.sort(arr);

        return String.format("%s %d = %s", input, n, solve2(list(arr), n));
    }

    private static List<char[]> list(char[] arr) {
        List<char[]> ret = new ArrayList<>();
        char[] next = arr;

        while (next != null) {
            ret.add(next);
            next = next(next);
        }

        return ret;
    }

    private static char[] next(char[] arr) {
        char[] ret = arr.clone();

        int idx = idx(ret);
        if (idx == -1) {
            return null;
        }

        int min = min(ret, idx);

        swap(ret, idx, min);
        Arrays.sort(ret, idx + 1, ret.length);

        return ret;
    }

    private static int idx(char[] arr) {
        for (int i = arr.length - 1; i > 0; i--) {
            if (arr[i] > arr[i - 1]) {
                return i - 1;
            }
        }

        return -1;
    }

    private static int min(char[] arr, int min) {
        for (int i = arr.length - 1; i > 0; i--) {
            if (arr[i] > arr[min]) {
                return i;
            }
        }

        return -1;
    }

    private static void swap(char[] arr, int a, int b) {
        char temp = arr[a];
        arr[a] = arr[b];
        arr[b] = temp;
    }

    private static String solve2(List<char[]> list, int n) {
        if (list.size() < n) {
            return "No permutation";
        } else {
            return String.valueOf(list.get(n - 1));
        }
    }

}