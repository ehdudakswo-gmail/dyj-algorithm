package baekjoon.p10820;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNextLine()) {
            for (int solve : solve(sc.nextLine())) {
                System.out.print(solve + " ");
            }
            System.out.println();
        }
    }

    private static int[] solve(String input) {
        int[] ret = new int[4];

        for (char ch : input.toCharArray()) {
            if (ch >= 'a' && ch <= 'z') {
                ret[0]++;
            } else if (ch >= 'A' && ch <= 'Z') {
                ret[1]++;
            } else if (ch >= '0' && ch <= '9') {
                ret[2]++;
            } else {
                ret[3]++;
            }
        }

        return ret;
    }

}
