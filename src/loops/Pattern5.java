package loops;

import java.util.Scanner;

public class Pattern5 {
    public static void main(String[] args) {
       int n=10;
     for (int i=1;i<=n;i++){
         for (int j=n;j>0;j--){
             if(j>i){
                 System.out.print("_");
             }else{
                 System.out.print("*");
             }
         }
         System.out.println();
     }
    }
}
