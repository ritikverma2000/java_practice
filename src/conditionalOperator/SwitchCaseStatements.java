package conditionalOperator;

import java.util.Scanner;

public class SwitchCaseStatements {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
//        System.out.println("Enter two numbers");
//        int a=s.nextInt();
//        int b=s.nextInt();
//        System.out.println("Enter the operation");
//        s.nextLine();
//        char ch=s.nextLine().charAt(0);
//        int result=0;
//        switch (ch){
//            case '+': result=a+b;
//
//                break;
//            case '-': result=a-b;
//
//                break;
//            case '*': result=a*b;
//
//                break;
//            case '/': result=a/b;
//
//                break;
//            default:
//                System.out.println("!!Enter the correct choice");
//                break;
//        }
//        System.out.println(result);
        System.out.println("Enter the rating");
        int n=s.nextInt();
        switch (n){
            case 1:
            case 2:
                System.out.println("Bad");
                break;
            case 3:
                System.out.println("Average");
                break;
            case 4:
            case 5:
                System.out.println("Good");
                break;
            default:
                System.out.println("Enter the correct rating");
                break;
        }

    }
}
