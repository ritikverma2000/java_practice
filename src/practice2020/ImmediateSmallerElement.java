package practice2020;

import java.util.ArrayList;
import java.util.Scanner;

public class ImmediateSmallerElement {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int t = s.nextInt();
        for (int j = 0; j < t; j++) {
            int n = s.nextInt();
            int[] arr = new int[n];
            for (int i = 0; i <arr.length ; i++) {
                arr[i]=s.nextInt();
            }
            ArrayList<Integer> al = new ArrayList<>();
            for (int i = 0; i < arr.length - 1; i++) {
                if (arr[i] > arr[i + 1]) {
                    al.add(arr[i + 1]);

                }else{
                    al.add(-1);
                }

            }
            al.add(-1);
            System.out.println(al.toString().replace("[","").replace("]","").replace(",",""));

        }
    }
}
