package arrays;

public class ArrayRevUsRec {
    public static void main(String[] args) {
        int a[]={7,8,9};
        int counter=0;
        arrrev(a,counter);
    }

    private static void arrrev(int[] a,int counter) {
        if(counter==a.length){
            return ;
        }

        arrrev(a,counter+1);
        System.out.println(a[counter]);

    }
}
