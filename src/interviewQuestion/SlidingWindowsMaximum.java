//package interviewQuestion;
//
//import java.util.Deque;
//import java.util.LinkedList;
//
//public class SlidingWindowsMaximum {
//    public static void main(String[] args) {
//
//    }
//    class Solution {
//        public int[] maxSlidingWindow(int[] a, int k) {
//            int n=a.length;
//            Deque<Integer>dq=new LinkedList<Integer>();
//             int []ans=new int[n-k+1];
//            for (int i = 0; i <k ; i++) {
//                while(!dq.isEmpty() && a[dq.peekLast()]<=a[i]){
//                    dq.removeLast();
//                }
//                dq.addLast(i);
//                for (int j = 0; j < ; j++) {
//
//                }
//
//            }
//             return ans;
//        }
//    }
//}
