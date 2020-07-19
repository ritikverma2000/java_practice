package conditionalOperator;

import java.util.Scanner;

public class NestedIfElse {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int result=0;
        int a=s.nextInt();
        int b=s.nextInt();
        int c=s.nextInt();

//        if (a > b) {
//            if(a>c){
//                result=a;
//            }else{
//                result=c;
//            }
//        }else{
//            if (b>c){
//                result=b;
//            }else{
//                result=c;
//            }
//        }
        result=a>b?a>c?a:c:b>c?b:c;
        System.out.println(result);
    }
}

