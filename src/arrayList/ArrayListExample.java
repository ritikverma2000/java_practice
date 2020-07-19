package arrayList;

import java.util.ArrayList;

public class ArrayListExample {
    public static void main(String[] args) {
        ArrayList<Integer> list=new ArrayList<>();
        int ar1[]={1,3,4,5,7};
        int ar2[]={2,3,5,6};
        for (int i=0;i<ar1.length;i++){
            for (int j=0;j<ar2.length;j++) {
                if (ar1[i] == ar2[j]) {
                    list.add(ar1[i]);

                }
            }
        }
        for (int item:list) {
            System.out.print(item+" ");
        }
    }
}
