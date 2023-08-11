package baekjoon.p11557;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while (t-- > 0) {
            int n = sc.nextInt();
            P11557[] input = new P11557[n];

            for (int i = 0; i < input.length; i++) {
                input[i] = new P11557(sc.next(), sc.nextInt());
            }

            System.out.println(solve(input));
        }
    }

    private static String solve(P11557[] input) {
        Arrays.sort(input, new Reverse());
        return input[0].getS();
    }

}

class P11557 {

    private String s;
    private Integer l;

    P11557(String s, int l) {
        this.s = s;
        this.l = l;
    }

    String getS() {
        return s;
    }

    Integer getL() {
        return l;
    }

}

class Reverse implements Comparator<P11557> {

    @Override
    public int compare(P11557 obj1, P11557 obj2) {
        return obj2.getL().compareTo(obj1.getL());
    }

}