package baekjoon.p03035;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int r = sc.nextInt();
        int c = sc.nextInt();
        int zr = sc.nextInt();
        int zc = sc.nextInt();

        String[] inputs = new String[r];
        for (int i = 0; i < inputs.length; i++) {
            inputs[i] = sc.next();
        }

        System.out.println(solve(inputs, zr, zc));
    }

    private static String solve(String[] inputs, int zr, int zc) {
        StringBuilder sb = new StringBuilder();
        for (String e : inputs) {
            for (int i = 0; i < zr; i++) {
                sb.append(zc(e, zc));
                sb.append("\n");
            }
        }

        return sb.toString();
    }

    private static String zc(String str, int n) {
        StringBuilder sb = new StringBuilder();
        for (char ch : str.toCharArray()) {
            for (int i = 0; i < n; i++) {
                sb.append(ch);
            }
        }

        return sb.toString();
    }

}