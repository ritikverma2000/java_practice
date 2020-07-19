package arrays;

public class Rec1 {
    public static void main(String[] args) {
        int n=6;
        PDI(n);
    }

    private static void PDI(int n) {
        if (n==0){
            return;
        }
        System.out.println(n);
        PDI(n-1);
        System.out.println(n);
    }
}
