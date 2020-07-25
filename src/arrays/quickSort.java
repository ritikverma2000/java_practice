package arrays;

public class quickSort {
    public static void main(String[] args) {
        int arr[]={38,27,43,3,9,82,10};
        //taking last element as pivot
        int start=0,end=arr.length-1;
        Quicksort(arr,start,end);
        for (int item:arr) {
            System.out.print(item+" ");

        }
    }

    private static void Quicksort(int[] arr, int start, int end) {
        if(start>=end){
            return;
        }
        int pivot=arr[end];
        int pivot_index=start;

        for (int i = start; i <=end-1 ; i++) {
            if (arr[i]<=pivot){
                  swap(arr,i,pivot_index);
                  pivot_index++;
            }

        }
        swap(arr,end,pivot_index);
        Quicksort(arr,start,pivot_index-1);
        Quicksort(arr,pivot_index+1,end);
    }
    private static void swap(int arr[],int a,int b){
        int temp=arr[a];
        arr[a]=arr[b];
        arr[b]=temp;

    }
}
