package baekjoon.p02529;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int k = sc.nextInt();
        String[] inputs = new String[k];

        for (int i = 0; i < inputs.length; i++) {
            inputs[i] = sc.next();
        }

        for (String solve : solve(inputs)) {
            System.out.println(solve);
        }
    }

    private static String[] solve(String[] inputs) {
        int len = inputs.length + 1;
        String set = "0123456789";
        String max = new StringBuilder(set).reverse().substring(0, len);
        String min = set.substring(0, len);

        Permutation permutation = new Permutation();
        while (!check(inputs, max)) {
            max = permutation.getPre(max);
        }


        while (!check(inputs, min)) {
            min = permutation.getNext(min);
        }

        return new String[]{max, min};
    }

    private static boolean check(String[] check, String str) {
        for (int i = 0; i < check.length; i++) {
            String operator = check[i];
            char a = str.charAt(i);
            char b = str.charAt(i + 1);

            if (isWrong(operator, a, b)) {
                return false;
            }
        }

        return true;
    }

    private static boolean isWrong(String operator, char a, char b) {
        if (operator.equals("<") && (a > b)) {
            return true;
        }

        if (operator.equals(">") && (a < b)) {
            return true;
        }

        return false;
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

            int nextIdx = getNextIdx(arr);
            if (nextIdx == -1) {
                return null;
            }

            int minIdx = getMinIdx(arr, nextIdx);
            if (minIdx == -1) {
                return null;
            }

            swap(arr, nextIdx, minIdx);
            Arrays.sort(arr, nextIdx + 1, arr.length);

            return String.valueOf(arr);
        }

        private int getNextIdx(char[] arr) {
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

        String getPre(String str) {
            char[] arr = str.toCharArray();

            int preIdx = getPreIdx(arr);
            if (preIdx == -1) {
                return null;
            }

            int maxIdx = getMaxIdx(arr, preIdx);
            if (maxIdx == -1) {
                return null;
            }

            swap(arr, preIdx, maxIdx);
            Arrays.sort(arr, preIdx + 1, arr.length);
            reverse(arr, preIdx + 1, arr.length - 1);

            return String.valueOf(arr);
        }

        private int getPreIdx(char[] arr) {
            for (int i = arr.length - 2; i >= 0; i--) {
                if (arr[i] > arr[i + 1]) {
                    return i;
                }
            }

            return -1;
        }

        private int getMaxIdx(char[] arr, int preIdx) {
            for (int i = arr.length - 1; i >= preIdx; i--) {
                if (arr[i] < arr[preIdx]) {
                    return i;
                }
            }

            return -1;
        }

        private void reverse(char[] arr, int a, int b) {
            while (a <= b) {
                swap(arr, a, b);
                a++;
                b--;
            }
        }

    }

}