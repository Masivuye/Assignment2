package assignment2.main;

import org.junit.Test;

import java.util.*;

public class CollectionTest {
    @Test
    public void HashMap() {
        HashMap hash = new HashMap();//creates hash object

        // Put elements to the map
        hash.put("3","Masivuye");
        hash.put("2","Bheme");
        hash.put("1","211210471");

        // Get a set of the entries
        Set set = hash.entrySet();

        // Get an iterator
        Iterator i = set.iterator();

        // Display elements
        while(i.hasNext()) {
            Map.Entry me = (Map.Entry)i.next();
            System.out.print(me.getKey() + ": ");
            System.out.println(me.getValue());
        }
        System.out.println();

    }
    @Test
    public void Set(){
        Set set = new HashSet();

        set.add("Green");
        set.add("Pink");
        set.add("Blue");
        set.add("Blue");


        System.out.println(set);
    }
    @Test
    public void list(){

        ArrayList<Double> list = new ArrayList();

        list.add(2.00);
        list.add(100.00);
        list.add(8.80);
        list.add(100.00);

        System.out.println(list);

    }
}
