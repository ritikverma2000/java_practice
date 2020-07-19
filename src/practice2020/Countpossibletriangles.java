package practice2020;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Countpossibletriangles {
    public static void main(String[] args)throws IOException {
        BufferedReader bf=new BufferedReader(new InputStreamReader(System.in));
        int t=Integer.parseInt(bf.readLine());
        for (int i = 0; i <t ; i++) {
            int n=Integer.parseInt(bf.readLine());
            int arr[];
            String [] data;
           data=bf.readLine().split(" ");
           arr=new int[data.length];
            for (int j = 0; j < data.length; j++) {
                arr[j]=Integer.parseInt(data[j]);
            }
         int value1= fact(data.length);
          int value2=fact(data.length-3);
          int ans=value1/(value2*6);
            System.out.println(ans);


        }

    }

    private static int  fact(int length) {
        if(length==0){
            return 1;
        }
        int fact=1;
        for (int i = 1; i <=length ; i++) {
            fact=fact*i;

        }
        return fact;



    }
}
