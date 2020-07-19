package loops;

import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        int original_number=n;
        int rem,rev=0;
        int digit=0;
        while(n!=0) {
            rem = n % 10;
            rev=rev*10+rem;
            n=n/10;
        }

  if(original_number==rev){
      System.out.println("it's palindrome number ");
  }else{
      System.out.println("it's not a palindrome number");
  }
    }
}
