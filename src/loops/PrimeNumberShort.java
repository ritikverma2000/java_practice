package loops;

import java.util.Scanner;

public class PrimeNumberShort {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int t = s.nextInt();
        for (int i = 0; i < t; i++) {
//            System.out.println("Enter the Number");
            int n = s.nextInt();

            int count = 0;
            for (int j = 2; j * j <= n; j++) {
                if (n % j == 0) {
                    count++;
                    break;
                }
            }
            if (n < 2) {

                count++;
            }
            if (count == 0) {
                System.out.println("Yes");
            } else {
                System.out.println("No");
            }


        }
    }
}
