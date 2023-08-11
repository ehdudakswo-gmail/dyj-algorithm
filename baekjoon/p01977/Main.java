package baekjoon.p01977;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] ret = solve(sc.nextInt(), sc.nextInt());
        for (int num : ret) {
            System.out.println(num);
        }
    }

    private static int[] solve(int m, int n) {
        int[] ret = new int[2];
        List<Integer> list = new ArrayList<>();

        int sqrt = (int) Math.sqrt(m);
        if (sqrt * sqrt < m) {
            sqrt++;
        }

        while (true) {
            int num = (sqrt * sqrt);

            if (num > n) {
                break;
            }

            list.add(num);
            sqrt++;
        }

        if (list.size() == 0) {
            return new int[]{-1};
        }

        ret[0] = sum(list);
        ret[1] = list.get(0);

        return ret;
    }

    private static int sum(List<Integer> list) {
        int ret = 0;

        for (int num : list) {
            ret += num;
        }

        return ret;
    }

}