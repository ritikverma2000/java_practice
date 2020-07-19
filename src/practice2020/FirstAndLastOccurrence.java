package practice2020;

import java.util.Scanner;

public class FirstAndLastOccurrence {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int k = s.nextInt();
        for (int i = 0; i < k; i++) {

            int n = s.nextInt();
            int arr[] = new int[n];
            for (int j = 0; j < arr.length; j++) {
                arr[j] = s.nextInt();
            }
            int target = s.nextInt();

            firstandlast(arr, target);
        }
    }



    private static void firstandlast(int[] arr, int target) {
        int firstOccurrence = 0, lastOccurrence = 0, count = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == target && count == 0) {
                firstOccurrence = i;
                count++;
            }
            if (arr[i] == target && count != 0) {
                lastOccurrence = i;
            }

        }
        if (lastOccurrence==0&&firstOccurrence==0){

            System.out.println(-1);
        }
       else if (lastOccurrence == 0) {
            lastOccurrence=firstOccurrence;
            System.out.println(firstOccurrence + " " + lastOccurrence);

        }

        else{

            System.out.println(firstOccurrence+" "+lastOccurrence);
        }


    }
}
