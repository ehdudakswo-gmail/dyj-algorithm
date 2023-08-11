package baekjoon.p12780;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println(solve(sc.next(), sc.next()));
    }

    private static int solve(String n, String h) {
        int ret = 0;
        int idx = -1;

        while (true) {
            idx = n.indexOf(h, idx+1);
            if(idx == -1) {
                break;
            }

            ret++;
        }

        return ret;
    }

}