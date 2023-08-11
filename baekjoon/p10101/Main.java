package baekjoon.p10101;

import java.util.HashSet;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println(solve(sc.nextInt(), sc.nextInt(), sc.nextInt()));
    }

    private static String solve(int a, int b, int c) {
        if (a + b + c == 180) {
            HashSet<Integer> set = new HashSet<>();
            set.add(a);
            set.add(b);
            set.add(c);

            switch (set.size()) {
                case 1:
                    return "Equilateral";
                case 2:
                    return "Isosceles";
                default:
                    return "Scalene";
            }
        } else {
            return "Error";
        }
    }

}