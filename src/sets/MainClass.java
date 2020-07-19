package sets;

import org.omg.PortableInterceptor.INACTIVE;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class MainClass {
    public static void main(String[] args) {
        Set<String>fruits=new HashSet<>();
        fruits.add("apple");
        fruits.add("Banana");

        System.out.println( fruits.add("Kiwi"));
        System.out.println(fruits.add("Banana"));
        System.out.println(fruits);


        Set<String>set=new LinkedHashSet<>();
        // order is maintained
        set.add("Apple");
        set.add("Banana");
        set.add("Kiwi");
        System.out.println(set);
        Set<String>set1=new TreeSet<>();
        // elements are in sorted oder
        set1.add("Banana");
        set1.add("Apple");
        set1.add("Kiwi");
        System.out.println(set1);
        //Union operation
        Set<Integer>x=new HashSet<>();
        x.add(23);
        x.add(1);
        x.add(6);
        Set<Integer>y=new HashSet<>();
        y.add(3);
        y.add(1);
        y.add(16);
       // x.addAll(y);
        //System.out.println(x);
        //intersection
            //x.retainAll(y);

        //System.out.println(x);
        //subset
        System.out.println(x.containsAll(y));

    }
}
