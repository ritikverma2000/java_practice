package arrays;

import java.util.Scanner;

public class TwoDArrays {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        int m=s.nextInt();
        int a[][]=new int[n][m];
        int b[][]=new int [n][m];
        int c[][]=new int[n][m];
        System.out.println("Enter the elements of matrix A ");
        for (int i=0;i<n;i++){
            for (int j=0;j<m;j++){
                a[i][j]=s.nextInt();
            }
        }
        System.out.println("Enter the elements of matrix B ");
        for (int i=0;i<n;i++){
            for (int j=0;j<m;j++){
                b[i][j]=s.nextInt();
            }
        }
        for (int i=0;i<n;i++){
            for (int j=0;j<m;j++){
                c[i][j]=a[i][j]+b[i][j];
            }
        }
        System.out.println("The elements of  matrix C are ");
        for (int i=0;i<n;i++){
            for (int j=0;j<m;j++){
                System.out.print(c[i][j]+"  ");
            }
            System.out.println();
        }





    }
}
