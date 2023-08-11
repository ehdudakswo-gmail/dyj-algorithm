package baekjoon.p09243;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println(solve(sc.nextInt(), sc.next(), sc.next()));
    }

    private static String solve(int n, String a, String b) {
        if (rev(a, n).equals(b)) {
            return "Deletion succeeded";
        } else {
            return "Deletion failed";
        }
    }

    private static String rev(String str, int n) {
        if (n % 2 == 0) {
            return str;
        }

        StringBuilder sb = new StringBuilder();
        for (char ch : str.toCharArray()) {
            if (ch == '0') {
                sb.append(1);
            } else {
                sb.append(0);
            }
        }

        return sb.toString();
    }

}