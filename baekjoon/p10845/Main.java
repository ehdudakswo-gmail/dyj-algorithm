package baekjoon.p10845;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        P10845 queue = new P10845();
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        while (n-- > 0) {
            switch (sc.next()) {
                case "push":
                    queue.push(sc.nextInt());
                    break;
                case "pop":
                    System.out.println(queue.pop());
                    break;
                case "size":
                    System.out.println(queue.size());
                    break;
                case "empty":
                    System.out.println(queue.empty());
                    break;
                case "front":
                    System.out.println(queue.front());
                    break;
                case "back":
                    System.out.println(queue.back());
                    break;
            }
        }
    }

    private static class P10845 {

        private int[] list = new int[10001];
        private int front = 0;
        private int back = 0;

        void push(int n) {
            list[back++] = n;
        }

        int pop() {
            if (isEmpty()) {
                return -1;
            } else {
                return list[front++];
            }
        }

        int size() {
            return (back - front);
        }

        int empty() {
            if (isEmpty()) {
                return 1;
            } else {
                return 0;
            }
        }

        int front() {
            if (isEmpty()) {
                return -1;
            } else {
                return list[front];
            }
        }

        int back() {
            if (isEmpty()) {
                return -1;
            } else {
                return list[back - 1];
            }
        }

        private boolean isEmpty() {
            return (front == back);
        }

    }

}