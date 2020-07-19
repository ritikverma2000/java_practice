package arrays;
import java.util.Scanner;

public class FactRec {
    public static void main(String[] args) {
        Scanner s= new Scanner(System.in);
        int n=4;
        System.out.println(factorial(n));
    }
    private static int factorial(int n) {
        if(n==0){
            return 1;
        }
        int fact;

        fact=n*factorial(n-1);

        return fact;

    }
}
