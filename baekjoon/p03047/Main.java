package baekjoon.p03047;

import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] inputs = {sc.nextInt(), sc.nextInt(), sc.nextInt()};
        String str = sc.next();

        for (int solve : solve(inputs, str)) {
            System.out.print(solve + " ");
        }
    }

    private static int[] solve(int[] inputs, String str) {
        Arrays.sort(inputs);
        int[] ret = new int[3];

        for (int i = 0; i < ret.length; i++) {
            ret[i] = inputs[str.charAt(i) - 'A'];
        }

        return ret;
    }

}