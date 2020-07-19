package practice2020;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ConvertArrayIntoZigZagFashion {
    public static void main(String[] args)throws IOException {
        BufferedReader inp = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(inp.readLine());
        for (int j = 0; j < t; j++) {


            int n = Integer.parseInt(inp.readLine());
            int a[] = new int[n];

            for (int i = 0; i < a.length; i++) {
                a[i] = Integer.parseInt(inp.readLine());
            }
            int count = 0;
            for (int i = 0; i <= a.length - 2; i++) {
                if (count == 0) {
                    if (a[i] <= a[i + 1]) {
                        count++;
                        continue;
                    } else {
                        int temp = a[i];
                        a[i] = a[i + 1];
                        a[i + 1] = temp;
                        count++;
                        continue;
                    }

                }
                if (count == 1) {
                    if (a[i] >= a[i + 1]) {
                        count--;
                        continue;
                    } else {
                        int temp = a[i];
                        a[i] = a[i + 1];
                        a[i + 1] = temp;
                        count--;
                        continue;

                    }

                }

            }
            for (int item : a) {
                System.out.print(item + " ");
            }
            System.out.println();
        }
    }
}
