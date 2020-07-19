package practice2020;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.Buffer;
import java.util.Arrays;
import java.util.Scanner;

import static java.util.Arrays.binarySearch;

public class BinarySearch {
    public static void main(String[] args)throws IOException {
        InputStreamReader r=new InputStreamReader(System.in);
        BufferedReader bf=new BufferedReader(r);
        int t =Integer.parseInt(bf.readLine());
        for (int k = 0; k < t; k++) {
            int n=Integer.parseInt(bf.readLine());
            int n1=Integer.parseInt(bf.readLine());
            int arr[]=new int[n];
            String line = bf.readLine(); // to read multiple integers line
            String[] strs = line.trim().split("\\s+");
            for(int j=0;j<arr.length;j++){
                arr[j]= Integer.parseInt(strs[j]);
            }
            System.out.println(binarysearch(arr,n1));

        }

    }

    private static int  binarysearch(int[] arr, int n1) {
        int low=0;
        int high=arr.length-1;
        while (low<=high){
            int mid=(low+high)/2;
            if(n1>arr[mid]){
                low=mid+1;
            }else if(n1<arr[mid]){
                high=mid-1;
            }else{
                return 1;
            }
        }
        return -1;
    }
}

