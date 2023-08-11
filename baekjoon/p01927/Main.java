package baekjoon.p01927;

import java.util.ArrayList;
import java.util.List;
import java.util.PriorityQueue;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] inputs = new int[n];

        for (int i = 0; i < inputs.length; i++) {
            inputs[i] = sc.nextInt();
        }

        for (int solve : solve(inputs)) {
            System.out.println(solve);
        }
    }

    private static List<Integer> solve(int[] inputs) {
        List<Integer> ret = new ArrayList<>();
        MinHeap heap = new MinHeap();

        for (int input : inputs) {
            if (input == 0) {
                if (heap.isEmpty()) {
                    ret.add(0);
                } else {
                    ret.add(heap.remove());
                }
            } else {
                heap.add(input);
            }
        }

        return ret;
    }

    private static class MinHeap {

        private PriorityQueue<Integer> pq = new PriorityQueue<>();

        void add(int n) {
            pq.add(n);
        }

        int remove() {
            return pq.remove();
        }

        boolean isEmpty() {
            return pq.isEmpty();
        }

    }

}