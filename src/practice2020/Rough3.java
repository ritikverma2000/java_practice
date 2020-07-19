package practice2020;

import java.util.ArrayList;
import java.util.Scanner;

public class Rough3 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int t = s.nextInt();
        for (int l = 0; l < t; l++) {
            int n = s.nextInt();

            int ar1[] = new int[n];
            for (int k=0;k<ar1.length;k++){
                ar1[k]=s.nextInt();
            }
            ArrayList<Integer> list = new ArrayList<>();
            for (int i = 0; i < ar1.length; i++) {
                if (i == ar1.length - 1) {
                    list.add(-1);
                    break;
                }
                int max = 0;
                for (int j = i + 1; j < ar1.length; j++) {
                    if (ar1[j] > max) {
                        max = ar1[j];
                    }
                }
                list.add(max);
            }

            for (int val : list) {
                System.out.print(val + " ");
            }
            System.out.println();
        }
    }
}
