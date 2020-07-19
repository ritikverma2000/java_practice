package practice2020;

import java.util.Scanner;

public class MajorityElement {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int t=s.nextInt();

      for (int k=0;k<t;k++){

          int n=s.nextInt();
          int b[]=new int[n];
          for (int j=0;j<b.length;j++){
              b[j]=s.nextInt();

          }

          System.out.println( majorityelement(b));
      }


    }

    private static int  majorityelement(int[] b) {
        int count=0;
        int max=0;
        for(int i=0;i<b.length;i++){
            if(max<b[i]){
                max=b[i];
            }
        }
        int a[]=new int[max+1];
        for (int i=0;i<b.length;i++){
            int index =b[i];
            a[index]++;

            if(a[index]>b.length/2){
                return index;
            }
        }

//        int count=0;
//        for (int j=0;j<a.length;j++){
//            if(a[j]>b.length/2){
//                return j;
//
//            }
        return -1;
        }


    }


