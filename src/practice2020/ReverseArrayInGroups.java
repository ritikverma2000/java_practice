package practice2020;//import java.util.ArrayList;
//import java.util.List;
//import java.util.Scanner;
//
//public class ReverseArrayInGroups {
//    public static void main(String[] args) {
//
//        Scanner s = new Scanner(System.in);
//        int t = s.nextInt();
//        for (int j = 0; j < t; j++) {
//            int n=s.nextInt();
//            int p=s.nextInt();
//            int arr[]=new int[n];
//            for (int k=0;k<arr.length;k++){
//                arr[k]=s.nextInt();
//            }
//            for (int i = 0; i < arr.length; i += p) {
//                int start = i;
//                int end = Math.min(i + p - 1, arr.length - 1);
//                reverse(arr, start, end);
//            }
//            System.out.println();
//            for (int i = 0; i < arr.length; i++) {
//                System.out.print(arr[i] + " ");
//            }
//
//
//        }
//    }
//    private static void reverse(int[] arr, int start, int end) {
//        while(start<end){
//            int temp=arr[start];
//            arr[start]=arr[end];
//            arr[end]=temp;
//            start++;
//            end--;
//        }
//    }
//}