package arrays;

import java.util.Scanner;

public class Sorting {
    public static void main(String[] args) {
        //Scanner s=new Scanner(System.in);
        //BubbleSort
        int a[]={5,4,7,6,1};
        int temp;
        boolean sorted = true;

        for (int i = 0; i < a.length - 1; i++) {
            for (int j = 0; j < a.length - 1-i; j++) {
                if (a[j] > a[j + 1]) {
                    temp = a[j];
                    a[j] = a[j + 1];
                    a[j + 1] = temp;
                   sorted=false;
                }
            }
            if (sorted) break;
        }
        for (int  item:a) {
            System.out.print(item+" ");

        }
    }
}
