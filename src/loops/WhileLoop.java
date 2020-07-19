package loops;

import java.util.Scanner;

public class WhileLoop {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        int numberOfDigits=(int)Math.log10(n)+1;
        int sum=0,rem;
        while(n!=0){
            rem=n%10;
            n=n/10;
            sum=sum+rem;

       }

        System.out.println(numberOfDigits);
        System.out.println(sum);
    }
}
