package loops;

import java.util.Scanner;

public class Pattern3 {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int n=6;
        for (int i=0;i<n;i++){

            for (int j=0;j<n;j++){
                if(j<i){
                    System.out.print("_");
                }else{
                    System.out.print("*");
                }


            }
            System.out.println();
        }


    }
}
