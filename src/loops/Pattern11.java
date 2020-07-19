package loops;

import java.util.Scanner;

public class Pattern11 {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int n=5;
        int spaces=2;
        for (int i=1;i<=n;i++){

                if(i==1){
                    for(int k=1;k<=n;k++){
                        System.out.print(" * ");
                    }
                }
                else {
                    for (int  j=1;j<=spaces;j++){
                        System.out.print("   ");
                    }
                    for (int l=1;l<=n-i+1;l++) {
                        System.out.print(" * ");
                    }
                    spaces=spaces+2;
                }
                System.out.println();
            }


        }
    }

