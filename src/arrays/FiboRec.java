package arrays;

import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;
import org.w3c.dom.ls.LSOutput;

import java.util.Scanner;

public class FiboRec {
    public static void main(String[] args) {
        int n=467;
        System.out.println( fibo(n));

    }

    private static int  fibo(int n) {
        if (n==1||n==0){
            return n;
        }
        return fibo(n-1)+fibo(n-2);



    }
}
