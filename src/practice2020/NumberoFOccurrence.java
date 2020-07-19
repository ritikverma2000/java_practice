package practice2020;

import java.util.Scanner;

public class NumberoFOccurrence {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int t=s.nextInt();
        for (int j=0;j<t;j++){
            int n=s.nextInt();
            int n1=s.nextInt();
            int arr[]=new int[n];
            for (int k=0;k<arr.length;k++){
                arr[k]=s.nextInt();
            }
            int arr1[]=new int[100000];
            for (int i=0;i<arr.length;i++){
                int index=arr[i];
                arr1[index]++;
            }

            for (int i=0;i<arr1.length;i++){
                if(i==n1){
                    if(arr1[i]==0){
                        System.out.println(-1);
                        break;
                    }
                    System.out.println(arr1[i]);
                    break;
                }
            }

        }
    }
}
