package Dp2020;

import java.util.Scanner;

public class taegetSumUnboundedKnapSack {
    public static void main(String[] args) {


        Scanner s = new Scanner(System.in);
        int t1= s.nextInt();
        while(t1>0){

  int n=s.nextInt();
  int w=s.nextInt();
  int wt1[]=new int[n];
            for (int k = 0; k <wt1.length ; k++) {
                wt1[k]=s.nextInt();

            }
//        int n=5;
//        int w=9;
//        int wt[]={3,4,4,4,8};


            //memorization part
            int t[][] = new int[n + 1][w + 1];
            for (int i = 0; i < n + 1; i++) {
                for (int j = 0; j < w + 1; j++) {
                    t[i][j] = -1;
                }
            }
            int max = knapsack(wt1, w, n, t);
            System.out.println(max);
            t1=t1-1;

        }

    }

            private static int knapsack(int wt[], int w, int n, int t[][]) {
                if (n == 0 || w == 0) {
                    return 0;
                }
                if (t[n][w] != -1) {
                    return t[n][w];
                }

                if (wt[n - 1] <= w) {
                    t[n][w] = Math.max(wt[n - 1] + knapsack(wt,  w - wt[n - 1], n , t),
                            knapsack(wt, w, n-1 , t));
                    return t[n][w];
                }
                else{
                    t[n][w] = knapsack(wt,  w, n-1, t);
                    return t[n][w];
                }

            }
        }
    

