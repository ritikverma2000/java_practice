package loops;

public class Pattern13 {
    public static void main(String[] args) {
        int n=5;
        int spaces=n-1;
        int count=1;
        for(int i=1;i<=n;i++){
            for(int k=1;k<=spaces;k++){
                System.out.print("   ");
            }
            spaces--;
            for (int j=1;j<=i;j++){
                System.out.print(" * ");
            }
            System.out.println();
        }
        for(int i=1;i<=n;i++){
            for (int l=1;l<=count;l++){
                System.out.print("   ");
            }
            count++;
            for (int j=1;j<=n-i;j++){
                System.out.print(" * ");

            }
            System.out.println();
        }
    }
}
