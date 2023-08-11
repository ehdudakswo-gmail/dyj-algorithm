package baekjoon.p02774;

import java.util.HashSet;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while (t-- > 0) {
            System.out.println(solve(sc.nextInt()));
        }
    }

    private static int solve(int x) {
        HashSet<Integer> hashSet = new HashSet<>();

        while (x != 0) {
            hashSet.add(x % 10);
            x /= 10;
        }

        return hashSet.size();
    }

}