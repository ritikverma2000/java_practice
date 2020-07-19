package arrays;

import java.util.Scanner;

public class InsertionSort {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
//        int n=s.nextInt();
//
//        int a[]=new int[n];
        int a[]={12,3,1,5,8};
        for (int counter=1;counter<=a.length-1;counter++){
            int val=a[counter];
            int j=counter-1;
            while (j>=0 && a[j]>val){
                a[j+1]=a[j];
                j--;
            }
            a[j+1]=val;
        }

    }
}
