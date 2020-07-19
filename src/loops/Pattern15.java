package loops;

import java.util.Scanner;

public class Pattern15 {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int n=5;
        int spaces=n-1;
        int count=0;
        for(int i=1;i<=n;i++){
            for (int k=1;k<=spaces;k++){
                System.out.print("    ");
            }
            spaces--;
            for (int j=1;j<=i+count;j++){

                System.out.print(j+"   ");


            }
            count++;


            System.out.println();
        }
    }
}

