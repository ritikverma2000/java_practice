package arrayList;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class MyArrayList {
    public static void main(String[] args) {
        List<String>fruits=new LinkedList<>();
        List<String>vegetables=new ArrayList<>();
        fruits.add("Apple");
        fruits.add("Orange");
        fruits.add("Banana");
        vegetables.add("tomato");
        vegetables.add("onion");
        vegetables.add("potato");
        fruits.addAll(vegetables);
        fruits.set(1,"Strawberry");
        fruits.removeAll(vegetables);
        String temp[]=new String[fruits.size()];
        fruits.toArray(temp);
        for (String item:temp) {
            System.out.println(item);

        }


    }
}
