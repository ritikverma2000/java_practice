package practice2020;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.Buffer;
import java.util.Arrays;
import java.util.Scanner;

public class Aryan {
    public static void main(String[] args) throws IOException {
        BufferedReader bf=new BufferedReader(new InputStreamReader(System.in));
        long ptime=System.currentTimeMillis();

        int t=Integer.parseInt(bf.readLine());
        int arr[];
        String data[];

        for (int i = 0; i <t ; i++) {

            data=bf.readLine().split(" ");
            arr=new int[data.length];
            for (int j = 0; j <data.length ; j++) {
                arr[j]=Integer.parseInt(data[j]);

            }
            System.out.println(Arrays.toString(arr));
        }
        long ctime=System.currentTimeMillis();
        System.out.println(ctime-ptime);
        Scanner s=new Scanner(System.in);
        int t1=s.nextInt();
        int arr1[];

        int data1;
        for (int i = 0; i <t1 ; i++) {


            data1=s.nextInt();
            arr1=new int[data1];
            for (int j = 0; j <data1 ; j++) {
                arr1[j]=s.nextInt();

            }
            System.out.println(Arrays.toString(arr1));
        }
        long ftime=System.currentTimeMillis();
        System.out.println(ftime-ctime);



    }
}
