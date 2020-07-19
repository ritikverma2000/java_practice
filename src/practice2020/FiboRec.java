package practice2020;
public class FiboRec {
    public static void main(String[] args) {
        int ans=fibo(4);
        System.out.println(ans);
    }    private static int fibo(int n) {
        if(n==0||n==1){
            return n;

        }
        System.out.println("n "+n);
        int x=fibo(n-1);
        System.out.println("x "+x);
        int y=fibo(n-2);
        System.out.println("y "+y);
        return x+y;

    }
}
