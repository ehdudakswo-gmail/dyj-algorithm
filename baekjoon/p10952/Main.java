package baekjoon.p10952;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<int[]> inputs = new ArrayList<>();

        while (true) {
            int a = sc.nextInt();
            int b = sc.nextInt();

            if (a == 0 && b == 0) {
                break;
            }

            inputs.add(new int[]{a, b});
        }

        for (int ret : solve(inputs)) {
            System.out.println(ret);
        }
    }

    private static int[] solve(List<int[]> inputs) {
        int[] ret = new int[inputs.size()];

        for (int i = 0; i < inputs.size(); i++) {
            int[] input = inputs.get(i);
            ret[i] = input[0] + input[1];
        }

        return ret;
    }

}