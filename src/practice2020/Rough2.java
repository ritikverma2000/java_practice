package practice2020;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Rough2 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int t = s.nextInt();
        for (int k = 0; k < t; k++) {
            int n = s.nextInt();
            int ar1[] = new int[n];
            ArrayList<Integer> list = new ArrayList<>();
            for (int i = 0; i < ar1.length; i++) {
                ar1[i] = s.nextInt();
                list.add(ar1[i]);
            }
            mutiplyrightandleft(list,ar1);
        }
    }

    private static void mutiplyrightandleft(ArrayList<Integer> list,int[]ar1) {
        List<Integer> head = list.subList(0, ar1.length / 2);
        List<Integer> tail = list.subList(ar1.length / 2, ar1.length);
        int sum = 0;
        for (int item : head) {
            sum += item;
        }

        int sum1 = 0;
        for (int item1 : tail) {
            sum1 += item1;

        }
        System.out.println(sum * sum1);
    }





}

