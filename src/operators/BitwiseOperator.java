package operators;

public class BitwiseOperator {
    public static void main(String[] args) {
        //Bitwise_And_operations
        int a=10;
        int b=13;
        int c=a & b;
        System.out.println(c);
     //Bitwise_Or_Operations
        int d=a|b;
        System.out.println(d);
        //RightShiftOperator
        int e=b>>2;
        //LeftShiftOperator
        int g=b<<1;
        System.out.println(g);
        System.out.println(e);
    }
}
