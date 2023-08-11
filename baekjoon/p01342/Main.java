package baekjoon.p01342;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println(solve(sc.next()));
    }

    private static int solve(String input) {
        Permutation permutation = new Permutation();
        List<String> list = permutation.getAll(input);

        int ret = 0;
        for (String str : list) {
            if (check(str)) {
                ret++;
            }
        }

        return ret;
    }

    private static boolean check(String str) {
        for (int i = 0; i < str.length() - 1; i++) {
            if (str.charAt(i) == str.charAt(i + 1)) {
                return false;
            }
        }

        return true;
    }

    private static class Permutation {

        List<String> getAll(String input) {
            List<String> ret = new ArrayList<>();
            char[] arr = input.toCharArray();
            Arrays.sort(arr);
            String str = String.valueOf(arr);
            ret.add(str);

            while (true) {
                str = getNext(str);
                if (str == null) {
                    break;
                }
                ret.add(str);
            }

            return ret;
        }

        String getNext(String str) {
            char[] arr = str.toCharArray();

            int startIdx = getStartIdx(arr);
            if (startIdx == -1) {
                return null;
            }

            int minIdx = getMinIdx(arr, startIdx);
            if (minIdx == -1) {
                return null;
            }

            swap(arr, startIdx, minIdx);
            Arrays.sort(arr, startIdx + 1, arr.length);

            return String.valueOf(arr);
        }

        private int getStartIdx(char[] arr) {
            for (int i = arr.length - 2; i >= 0; i--) {
                if (arr[i] < arr[i + 1]) {
                    return i;
                }
            }

            return -1;
        }

        private int getMinIdx(char[] arr, int startIdx) {
            for (int i = arr.length - 1; i >= startIdx; i--) {
                if (arr[i] > arr[startIdx]) {
                    return i;
                }
            }

            return -1;
        }

        private void swap(char[] arr, int a, int b) {
            char temp = arr[a];
            arr[a] = arr[b];
            arr[b] = temp;
        }

    }

}