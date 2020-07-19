package loops;

import java.util.Scanner;

public class Pattern2 {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int n=6;

        for (int i=0;i<n;i++){
            int j=0;
            while(j<=i){
                System.out.print("*"+ " ");
                j++;
            }
            System.out.println();
        }

    }
}

