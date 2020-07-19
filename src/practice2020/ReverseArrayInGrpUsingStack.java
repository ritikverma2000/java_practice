package practice2020;

import java.util.Scanner;
import java.util.Stack;

public class ReverseArrayInGrpUsingStack {
    public static void main(String[] args) {
        Stack<Integer>stack=new Stack<>();


        Scanner s=new Scanner(System.in);
        int t=s.nextInt();
        for (int l=0;l<t;l++) {
            int n=s.nextInt();
            int p=s.nextInt();
            int arr[]=new int[n];
            int arr1[]=new int[n];

            for (int h=0;h<arr.length;h++){
                arr[h]=s.nextInt();
            }


            for (int i = 0; i <= arr.length; i += p) {
                int j = i, count = 0;
                while (count < p) {
                    if (j == arr.length) {
                        break;
                    }
                    stack.push(arr[j]);
                    j++;
                    count++;
                }
                int k = i;
                while (!stack.isEmpty()) {
                    arr1[k]=stack.pop();
                    k++;
                }


            }
            System.out.println();
            for (int i=0;i<arr1.length;i++){
                System.out.print(arr1[i]+" ");
            }



        }

    }
}
