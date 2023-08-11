package baekjoon.p04806;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int ret = 0;

        while (sc.hasNextLine()) {
            String input = sc.nextLine();
            if (input.equals("END")) {
                break;
            }

            ret++;
        }

        System.out.println(ret);
    }

}