package baekjoon.p02526;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println(solve(sc.nextInt(), sc.nextInt()));
    }

    private static int solve(int n, int p) {
        List<Integer> list = new ArrayList<>();
        int x = n;

        while (true) {
            x = (x * n % p);
            int idx = list.indexOf(x);
            if (idx != -1) {
                return (list.size() - idx);
            }

            list.add(x);
        }
    }

}