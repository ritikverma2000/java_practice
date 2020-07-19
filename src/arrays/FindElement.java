package arrays;

public class FindElement {
    public static void main(String[] args) {
        int a[]={4,9,8,7,6};
        int n=6;
        int counter=0;
        System.out.println(finding(a,n,counter));
    }

    private static int finding(int[] a,int n,int counter) {
        if(counter==a.length){
            return -1;
        }
        if(a[counter]==n){
            return counter;
        }
        return finding(a,n,counter+1);

    }
}
