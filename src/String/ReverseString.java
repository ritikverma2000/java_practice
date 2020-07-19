package String;

import java.util.Scanner;

public class ReverseString {


//        String b="";
//
//      int al[]=new int [a.length()-1];
////        for (int i=0;i<a.length();i++){
////            while (a.charAt(i)!=32){
////                al[i]+=a.charAt(i);
////                i++;
////            }
////
////        }
//        a.toCharArray();
//        for (int i=a;i>=0;i--){
//            System.out.print( a[i]+" ");
//        }
        public static void main(String[] args) {
            Scanner scanner=new Scanner(System.in);
            String s="I love java , the coffee ";
            String sum="";
            String ans="";
            for (int i = s.length()-1; i >=0 ; i--) {
                char ch=s.charAt(i);

                if(ch==' '){
                    ans=ans+sum+' ';
                    sum="";
                }else {
                    sum=ch+sum;
                }
            }
            ans=ans+sum;
            System.out.println(ans);
        }


    }



