package practice2020;

import java.io.BufferedReader;
import java.util.*;

public class FindTheSmallestAndSecondSmallestElement {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int t=s.nextInt();
        for (int i = 0; i <t ; i++) {
            int n=s.nextInt();
            int arr[]=new int[n];
            for (int j = 0; j <arr.length ; j++) {
                arr[j]=s.nextInt();
            }

            Arrays.sort(arr);
            if(arr.length==1){
                System.out.println("-1");
            }else {
                int smallest = arr[0];
                int secondSmallest = arr[1];
                for (int j = 2; j < arr.length; j++) {
                    if (smallest == secondSmallest) {
                        secondSmallest = arr[j];
                    }
                }
                if (secondSmallest == smallest) {
                    System.out.println(-1);
                } else {
                    System.out.println(smallest + " " + secondSmallest);
                }
            }

        }
    }





}

