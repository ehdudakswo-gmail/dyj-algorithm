package baekjoon.p11286;

import java.util.ArrayList;
import java.util.Comparator;
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
        PriorityQueue<Integer> pq = new PriorityQueue<>(new Comparator<Integer>() {
            @Override
            public int compare(Integer a, Integer b) {
                int aa = Math.abs(a);
                int bb = Math.abs(b);
                if (aa != bb) {
                    return aa - bb;
                } else {
                    return a - b;
                }
            }
        });

        List<Integer> ret = new ArrayList<>();
        for (int e : inputs) {
            if (e == 0) {
                if (pq.isEmpty()) {
                    ret.add(0);
                } else {
                    ret.add(pq.poll());
                }
            } else {
                pq.add(e);
            }
        }

        return ret;
    }

}