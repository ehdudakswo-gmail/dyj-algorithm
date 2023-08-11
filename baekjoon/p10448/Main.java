package baekjoon.p10448;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    private static List<Integer> list = new ArrayList<>();

    public static void main(String[] args) {
        list();
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            System.out.println(solve(sc.nextInt()));
        }
    }

    private static void list() {
        int n = 1;
        while (true) {
            int nn = (n * (n + 1)) / 2;
            if (nn > 1000) {
                break;
            }

            list.add(nn);
            n++;
        }
    }

    private static int solve(int k) {
        if (check(k)) {
            return 1;
        } else {
            return 0;
        }
    }

    private static boolean check(int n) {
        for (int i = 0; i < list.size(); i++) {
            for (int j = 0; j < list.size(); j++) {
                for (int k = 0; k < list.size(); k++) {
                    if (list.get(i) + list.get(j) + list.get(k) == n) {
                        return true;
                    }
                }
            }
        }

        return false;
    }

}