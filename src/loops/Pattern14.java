package loops;

public class Pattern14 {
    public static void main(String[] args) {
        int n = 10;
        int spaces=1;
        int count=n*2-1;
                for (int i = 1; i <= n; i++) {
            for (int j = n; j >= i; j--) {
                System.out.print(" * ");
            }

            for (int k=1;k<=spaces;k++){
                System.out.print("   ");
            }
            spaces=spaces+2;
            for (int l=n;l>=i;l--){
                System.out.print(" * ");
            }
            System.out.println();


        }
        System.out.println();

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(" * ");
            }
              for (int k=1;k<=count;k++){
                  System.out.print("   ");
              }
              count=count-2;
              for (int l=1;l<=i;l++){
                  System.out.print(" * ");
              }
            System.out.println();

        }

    }
}