package loops;

import java.util.Scanner;

public class Pattern9 {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        int count=2,space=0;
        for (int i=1;i<=n;i++){
            if(i==1||i==n){
                for (int j=1;j<=i;j++){
                    System.out.print("*");
                }
            }else{
                for (int k=1;k<=count;k++){
                    System.out.print("*");
                    for (int j=1;j<=space;j++){
                        System.out.print(" ");

                    }

                }
                space++;

            }

            System.out.println();
        }
    }
}
