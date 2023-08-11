package baekjoon.p06443;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        String[] inputs = new String[n];
        for (int i = 0; i < inputs.length; i++) {
            inputs[i] = sc.next();
        }

        for (String solve : solve(inputs)) {
            System.out.println(solve);
        }
    }

    private static List<String> solve(String[] inputs) {
        List<String> ret = new ArrayList<>();
        Permutation permutation = new Permutation();

        for (String input : inputs) {
            ret.addAll(permutation.getAll(input));
        }

        return ret;
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