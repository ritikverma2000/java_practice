package loops;

public class Pattern12 {
    public static void main(String[] args) {
        int n = 10;
        int spaces = n - 1;
        for (int i = 1; i <= n; i++) {
            if (i == 1) {
                for (int k = 1; k <= spaces; k++) {
                    System.out.print(" ");
                }
                System.out.print("*");
            }
            else{
                for (int j=1;j<=spaces;j++){
                    System.out.print(" ");
                }
                for (int l=1;l<=i*2-1;l++){
                    if(l%2==0){
                        System.out.print("_");
                    }else{
                        System.out.print("*");
                    }
                }
            }
            spaces--;
            System.out.println();
        }
    }
}

