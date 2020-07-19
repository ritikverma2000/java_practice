package arrays;

import java.util.Scanner;

public class FiboUsgFormula {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int t = s.nextInt();
        for (int i = 0; i < t; i++) {
            int n = s.nextInt();
            double fib;
            int fib2;
            fib = (Math.sqrt(5) + 1) / 2;
            fib2 = (int) Math.round((Math.pow(fib, n) / Math.sqrt(5)));
            System.out.println(fib2);
        }
    }
}
