package baekjoon.p02947;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] inputs = new int[5];

        for (int i = 0; i < inputs.length; i++) {
            inputs[i] = sc.nextInt();
        }

        for (int[] solve : solve(inputs)) {
            for (int n : solve) {
                System.out.print(n + " ");
            }
            System.out.println();
        }
    }

    private static List<int[]> solve(int[] inputs) {
        List<int[]> ret = new ArrayList<>();
        int[] arr = inputs;
        int len = inputs.length;

        for (int i = 0; i < len - 1; i++) {
            for (int j = 0; j < len - 1 - i; j++) {
                if (arr[j] > arr[j + 1]) {
                    arr = arr.clone();
                    swap(arr, j, j + 1);
                    ret.add(arr);
                }
            }
        }

        return ret;
    }

    private static void swap(int[] arr, int a, int b) {
        int temp = arr[a];
        arr[a] = arr[b];
        arr[b] = temp;
    }

}