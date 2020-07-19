package operators;

public class ArithmaticOperator {
    public static void main(String[] args) {
  int a=23;
  int b=45;
//  int d=a*a+b*b+2*a*b;
//        System.out.println(d);
//int c=  (a+b)*(a+b);
//        System.out.println(c);
//        double c=(double)b/(double)a;
//        System.out.println(c);
    int c=b++;
    int d=++b;
        System.out.println(c+" "+b+" "+d);
    }
}
