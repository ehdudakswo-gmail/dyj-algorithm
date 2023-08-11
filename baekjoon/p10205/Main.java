package baekjoon.p10205;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int k = sc.nextInt();

        for (int i = 1; i <= k; i++) {
            int solve = solve(sc.nextInt(), sc.next());
            System.out.println(String.format("Data Set %d:\n%d\n", i, solve));
        }
    }

    private static int solve(int h, String str) {
        int ret = h;
        for (char ch : str.toCharArray()) {
            switch (ch) {
                case 'b':
                    ret--;
                    break;
                case 'c':
                    ret++;
                    break;
            }
        }

        return ret;
    }

}