package loops;

import java.util.Scanner;

public class SeriesSum {
    public static void main(String[] args) {
        //1+1/2+1/3+1/4+...
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
//      int n=90;
//        float sum=0;
//        for (float i=0;i<n;i++){
//            sum+=1/(i+1);
//
//        }
//        System.out.println(sum);
        // 1-1/2+1/3-1/4+1/5-....1/n
        float sum1=0;
        for (float j=0;j<n;j++){
            if(j%2==0){
                sum1+=1/(j+1);
            }else{
                sum1-=1/(j+1);

            }
        }
        System.out.println(sum1);
    }


}
