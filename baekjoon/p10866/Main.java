package baekjoon.p10866;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        P10866 deque = new P10866(n);

        while (n-- > 0) {
            switch (sc.next()) {
                case "push_front":
                    deque.pushFront(sc.nextInt());
                    break;
                case "push_back":
                    deque.pushBack(sc.nextInt());
                    break;
                case "pop_front":
                    System.out.println(deque.popFront());
                    break;
                case "pop_back":
                    System.out.println(deque.popBack());
                    break;
                case "size":
                    System.out.println(deque.size());
                    break;
                case "empty":
                    System.out.println(deque.empty());
                    break;
                case "front":
                    System.out.println(deque.front());
                    break;
                case "back":
                    System.out.println(deque.back());
                    break;
            }
        }
    }

    private static class P10866 {

        private int[] list;
        private int front;
        private int back;

        P10866(int n) {
            this.list = new int[n * 2];
            this.front = n;
            this.back = n;
        }

        void pushFront(int n) {
            list[--front] = n;
        }

        void pushBack(int n) {
            list[back++] = n;
        }

        int popFront() {
            if (isEmpty()) {
                return -1;
            } else {
                return list[front++];
            }
        }

        int popBack() {
            if (isEmpty()) {
                return -1;
            } else {
                return list[--back];
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