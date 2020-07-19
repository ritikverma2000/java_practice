package practice2020;



import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.PriorityQueue;


public class ThirdSmallestElement{
    public static void main(String[] args)throws IOException {
        BufferedReader bf=new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(bf.readLine());
        for (int l = 0; l < t; l++) {
          int n = Integer.parseInt(bf.readLine());
          int arr[];
          String data[];
            data=bf.readLine().split(" ");
            arr=new int[data.length];
            for (int j = 0; j <arr.length; j++) {


                arr[j]= Integer.parseInt(data[j]);

            }
            int k=Integer.parseInt(bf.readLine());
            PriorityQueue<Integer> pq = new PriorityQueue<>();
            for ( int i = 0; i < arr.length; i++) {
                pq.add(arr[i]);
            }

            while (k > 0) {
                if (k == 1) {
                    System.out.println(pq.remove());
                    break;
                }
                pq.remove();
                k--;
            }

        }
    }
}
