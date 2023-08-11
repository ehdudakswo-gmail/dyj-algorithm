package baekjoon.p03181;

import java.util.HashSet;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println(solve(sc.nextLine()));
    }

    private static String solve(String input) {
        HashSet<String> except = new HashSet<>();
        except.add("i");
        except.add("pa");
        except.add("te");
        except.add("ni");
        except.add("niti");
        except.add("a");
        except.add("ali");
        except.add("nego");
        except.add("no");
        except.add("ili");

        StringBuilder sb = new StringBuilder();
        String[] inputs = input.split(" ");

        for (int i = 0; i < inputs.length; i++) {
            if (i == 0 || !except.contains(inputs[i])) {
                sb.append(inputs[i].substring(0, 1).toUpperCase());
            }
        }

        return sb.toString();
    }

}