package arrayList;

import java.util.ArrayList;
import java.util.Scanner;

public class StoreSumInArrayList {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        ArrayList<Integer>list=new ArrayList<>();
        int n=s.nextInt();
        int m=s.nextInt();
        int ar1[]=new int[n];
        int ar2[]=new int[m];
        for (int i=0;i<ar1.length;i++){
            ar1[i]=s.nextInt();
        }for (int j=0;j<ar2.length;j++){
            ar2[j]=s.nextInt();
        }
        int sum1=0;
        int count1=ar1.length;
        for (int i=0;i<ar1.length;i++){

            sum1=sum1+(ar1[i]*(int)Math.pow(10,count1-1));
            count1--;
        }
        int sum2=0;
        int count2=ar2.length;
        for (int i=0;i<ar2.length;i++){

            sum2=sum2+(ar2[i]*(int)Math.pow(10,count2-1));
            count2--;
        }

        list.add(sum1+sum2);
        for (int item:list) {
            System.out.println(item);

        }

    }
}
