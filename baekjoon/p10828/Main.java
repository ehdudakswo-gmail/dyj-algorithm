package baekjoon.p10828;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        P10828 stack = new P10828();
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        while (n-- > 0) {
            switch (sc.next()) {
                case "push":
                    stack.push(sc.nextInt());
                    break;
                case "pop":
                    System.out.println(stack.pop());
                    break;
                case "top":
                    System.out.println(stack.top());
                    break;
                case "size":
                    System.out.println(stack.size());
                    break;
                case "empty":
                    System.out.println(stack.empty());
                    break;
            }
        }
    }

    private static class P10828 {

        private int[] list = new int[10001];
        private int idx = -1;

        void push(int n) {
            list[++idx] = n;
        }

        int pop() {
            if (isEmpty()) {
                return -1;
            } else {
                return list[idx--];
            }
        }

        int top() {
            if (isEmpty()) {
                return -1;
            } else {
                return list[idx];
            }
        }

        int size() {
            return (idx + 1);
        }

        int empty() {
            if (isEmpty()) {
                return 1;
            } else {
                return 0;
            }
        }

        private boolean isEmpty() {
            return (idx == -1);
        }
    }

}