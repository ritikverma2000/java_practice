package practice2020;

import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class Rough {
    public static void main(String[] args) throws IOException {
        BufferedReader inp = new BufferedReader(new InputStreamReader(System.in));
        int n= Integer.parseInt(inp.readLine()); // for taking a number as an input
        String str = inp.readLine(); // for taking a string as an input
        double d = Double.parseDouble (inp.readLine() );


        System.out.println("String: " + str);
        System.out.println("Double: " + d);
        System.out.println("Int: " + n);
    }


        }









