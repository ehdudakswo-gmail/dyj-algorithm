package baekjoon.p11098;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        while (n-- > 0) {
            int p = sc.nextInt();
            P11098[] inputs = new P11098[p];

            for (int i = 0; i < inputs.length; i++) {
                inputs[i] = new P11098(sc.nextInt(), sc.next());
            }

            System.out.println(solve(inputs));
        }
    }

    private static String solve(P11098[] inputs) {
        Arrays.sort(inputs, new PriceComparator());
        return inputs[inputs.length - 1].getName();
    }

}

class P11098 {

    private Integer price;
    private String name;

    P11098(int price, String name) {
        this.price = price;
        this.name = name;
    }

    Integer getPrice() {
        return price;
    }

    String getName() {
        return name;
    }

}

class PriceComparator implements Comparator<P11098> {

    @Override
    public int compare(P11098 obj, P11098 obj2) {
        return obj.getPrice().compareTo(obj2.getPrice());
    }

}