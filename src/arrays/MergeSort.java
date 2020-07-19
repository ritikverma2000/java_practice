//package arrays;
//
//public class MergeSort {
//    public static void main(String[] args) {
//        int a[]={38,27,43,3,9,82,10};
//        mergeSort(a);
//    }
//    private  static  int[]mergeSort(int[]a){
//        if(a.length<=1){
//            return a;
//        }
//        int mid=a.length/2;
//
//        int b[]=new int[mid];
//        for (int i=0;i<b.length;i++){
//            b[i]=a[i];
//        }
//        int []c;
//        if (a.length%2==0){
//            c=new int[mid];
//        }else{
//            c=new int[mid+1];
//        }
//       for (int j=0;j<c.length;j++){
//           c[j]=a[mid+j];
//       }
//
//       int [] result=new int[a.length];
//       b=mergeSort(b);
//       c=mergeSort(c);
//
//      result=merge(c,b);
//
//
//    }
//    private static int[]merge(int[] c,int[] b){
//        int[]result=new int[c.length+b.length];
//
//    }
//}
