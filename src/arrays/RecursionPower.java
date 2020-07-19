package arrays;

import java.util.Scanner;

import static com.sun.org.apache.xalan.internal.lib.ExsltMath.power;

public class RecursionPower {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int x=s.nextInt();
        int y=s.nextInt();

        System.out.println(power(x,y));
    }
    private static int power(int a,int b){
        if(b==1){
            return a;
        }
        if(b==0){
            return 1;
        }
        int result=1;
        result=a*power(a,b-1);
        return result;

    }
}
