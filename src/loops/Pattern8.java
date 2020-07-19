package loops;

import java.util.Scanner;

public class Pattern8 {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        int count=n;
        for (int i=1;i<=n*2-1;i++){

            if(i>n){
                for (int j=1;j<=count-1;j++){
                    System.out.print("*");

                }
                count--;
            }else{
                for (int j=1;j<=i;j++){

                    System.out.print("*");
                }
            }
            System.out.println();

        }
    }
}
