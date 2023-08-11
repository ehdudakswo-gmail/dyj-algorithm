package baekjoon.p01373;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println(solve(sc.next()));
    }

    private static String solve(String input) {
        StringBuilder sb = new StringBuilder();
        String binary3 = binary(input, 3);

        for (int i = 0; i < binary3.length(); i += 3) {
            String binary = binary3.substring(i, i + 3);
            String oct = Integer.toOctalString(Integer.parseInt(binary, 2));
            sb.append(oct);
        }

        return sb.toString();
    }

    private static String binary(String str, int cnt) {
        while (str.length() % cnt != 0) {
            str = ("0" + str);
        }

        return str;
    }

}