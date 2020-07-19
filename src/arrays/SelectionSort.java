package arrays;

public class SelectionSort {
    public static void main(String[] args) {
        int a[]={14,33,27,10,35,19,42,44};
        int temp;

        for (int i=0;i<a.length-1;i++){
            for (int j=i+1;j<=a.length-1;j++){
                if(a[i]>a[j]){
                    temp = a[i];
                    a[i] = a[j];
                    a[j] = temp;
                }
            }
        }
        for (int item:a) {
            System.out.print(item+" ");

        }
    }
}
