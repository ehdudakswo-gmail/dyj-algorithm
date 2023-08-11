package baekjoon.p02703;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        sc.nextLine();

        while (t-- > 0) {
            System.out.println(solve(sc.nextLine(), sc.nextLine()));
        }
    }

    private static String solve(String a, String b) {
        StringBuilder sb = new StringBuilder();
        for (char ch : a.toCharArray()) {
            if (ch >= 'A' && ch <= 'Z') {
                int idx = ch - 'A';
                sb.append(b.charAt(idx));
            } else {
                sb.append(ch);
            }
        }

        return sb.toString();
    }

}