package loops;

import java.util.Scanner;

public class ForLoops {
    public static void main(String[] args) {

        Scanner s=new Scanner(System.in);
//        System.out.println("Enter the number whose table you want");
//        int n=s.nextInt();
//        int result;
//        for (int i=1;i<=10;i++){
//            System.out.println(n+"*"+i+"="+n*i);
//        }
        System.out.println("Enter the number whose factorial you want ");
        int n1=s.nextInt();
        int result1=1;
        for (int i=n1;i>=1;i--){
            result1=result1*i;

        }
        System.out.println(result1);

    }
}


