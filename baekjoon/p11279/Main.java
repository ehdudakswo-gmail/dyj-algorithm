package baekjoon.p11279;

import java.util.ArrayList;
import java.util.Collections;
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
        MaxHeap heap = new MaxHeap();

        for (int input : inputs) {
            if (input == 0) {
                if (heap.size() == 0) {
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

    private static class MaxHeap {

        private PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.<Integer>reverseOrder());

        void add(int n) {
            pq.add(n);
        }

        int remove() {
            return pq.remove();
        }

        int size() {
            return pq.size();
        }

    }

}