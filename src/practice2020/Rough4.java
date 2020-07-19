package practice2020;

import java.util.Scanner;
/* This is also a comment // More comments */
// /* This is a // // comment */

public class Rough4 {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int t=s.nextInt();
        for (int i=0;i<t;i++){
            int c=s.nextInt();
            if(c==1){
                int w=1;
                String s1,s2;
                System.out.println("enter the first string");
                s1=s.nextLine();
                System.out.println(" enter the second string");
                s2=s.nextLine();


                if (s1.equals(s2)){
                    System.out.println("same");
                }else{
                    System.out.println("different");
                }
            }
            else if(c==2){
                int a=s.nextInt();
                int b=s.nextInt();
                if(a==b){
                    System.out.println("same");
                }else{
                    System.out.println("different");
                }
            }else{

                int s1=s.nextInt();
                int a1[]=new int[s1];
                int s2=s.nextInt();
                int a2[]=new int [s2];
                boolean a3[]= new boolean[s1];
                for (int j=0;j<s1;j++){
                       a1[j]=s.nextInt();
                }
                for (int k=0;k<s2;k++){
                    a2[k]=s.nextInt();
                }

               for (int l=0;l<s1&&l<s2;l++ ){
                   if (a1[l]==a2[l]){
                       a3[l]=true;
                   }else{
                       a3[l]=false;
                   }
               }
               for (int p=0;p<a3.length;p++){
                   if(!a3[p]){
                       System.out.println("different");
                   }
               }
                System.out.println("same");
            }
        }
    }


}
