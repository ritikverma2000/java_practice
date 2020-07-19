package conditionalOperator;

import java.util.Scanner;

public class IfClass {
    public static void main(String[] args) {
       Scanner s=new Scanner(System.in);
       int n=s.nextInt();

            if(n%2==0){
                System.out.println("The Number is even");
            }else{
                System.out.println("The number is odd");
            }
            int age=19;
            String x="yes";
            String y="no";
            String z;
            z=(age>20)?x:y;
        System.out.println(z);
    }
}
