package loops;

public class Pattern16 {
    public static void main(String[] args) {
        int n=6;
        int spaces=n-1;
        int count=0;
        for(int i=1;i<=n;i++){
            for (int k=1;k<=spaces;k++){
                System.out.print("    ");
            }
            spaces--;
            for (int j=1;j<=i+count;j++){
                if(j==1||j==i+count){
                    System.out.print(i+"   ");
                }else{
                    System.out.print(0+"   ");
                }



            }
            count++;


            System.out.println();
        }
    }
}
