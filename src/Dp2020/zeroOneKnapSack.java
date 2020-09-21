package Dp2020;

public class zeroOneKnapSack {
    public static void main(String[] args) {
        int wt[] = {2, 3, 4, 5};
        int val[] = {3, 4, 5, 6};
        int w = 5;
        int n = 4;
        //memorization part
        int t[][] = new int[n + 1][w + 1];
        for (int i = 0; i < n + 1; i++) {
            for (int j = 0; j < w + 1; j++) {
                t[i][j] = -1;
            }
        }
        int max = knapsack(wt, val, w, n, t);
        System.out.println(max);

    }

    private static int knapsack(int wt[], int val[], int w, int n, int t[][]) {
        if (n == 0 || w == 0) {
            return 0;
        }
        if (t[n][w] != -1) {
            return t[n][w];
        }

        if (wt[n - 1] <= w) {
            t[n][w] = Math.max(val[n - 1] + knapsack(wt, val, w - wt[n - 1], n - 1, t),
                                            knapsack(wt, val, w, n - 1, t));
            return t[n][w];
        }
        else{
            t[n][w] = knapsack(wt, val, w, n - 1, t);
            return t[n][w];
        }

    }
}
