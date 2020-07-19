package practice2020;

import java.util.Arrays;
import java.util.Scanner;

public class MaximumProductOfTwoNumbers {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int t=s.nextInt();
        for (int l=0;l<t;l++) {
            int n=s.nextInt();
            int n1=s.nextInt();
            int arr[]=new int[n];
            for (int k=0;k<arr.length;k++){
                arr[k]=s.nextInt();
            }

            Arrays.sort(arr);
            int count=arr.length-1;
            while(n1!=0){
                System.out.print(arr[count]+" ");
                count--;
                n1--;
            }
            System.out.println();
        }


        }
    }

