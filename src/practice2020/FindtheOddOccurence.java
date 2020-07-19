package practice2020;

import java.util.Scanner;

public class FindtheOddOccurence {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int t=s.nextInt();
        for (int i=0;i<t;i++){
            int n=s.nextInt();
            int arr[]=new int[n];
//            int arr1[]=new int[10000000];
            for (int k=0;k<arr.length;k++){
                arr[k]=s.nextInt();
            }
            int res=0;
            System.out.println(oddoccu(arr,res));


//            System.out.println(oddOccurance(arr,arr1));


        }
    }

    private static int oddoccu(int[] arr, int res) {

        for ( int i=0;i<arr.length;i++){
            res=res^arr[i];
        }
   return res;
    }

//    private static int oddOccurance(int[] arr, int[] arr1) {
//        for (int j=0;j<arr.length;j++){
//            int index=arr[j];
//            arr1[index]++;
//        }
//        for (int i=0;i<arr1.length;i++){
//            if(arr1[i]%2!=0){
//                return i;
//            }
//        }
//        return 0;
//    }
}
