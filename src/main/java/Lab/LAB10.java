package Lab;

import java.util.*;

public class LAB10 {
    public static void main(String[] args) {
        List list = new LinkedList();
        list.add(new Product("1", "1", "1", 12));
        list.add(new Product("1", "1", "1", 13));
        list.add(new Product("1", "1", "1", 14));
        System.out.println("list : " + list);

        Set set = new HashSet();
        set.add(new Product("1", "1", "1", 12));
        set.add(new Product("1", "1", "1", 12));
        set.add(new Product("2", "1", "1", 12));
        System.out.println("set : " + set);

        Map<Integer,String> map = new HashMap<Integer,String>();
        map.put(2,"a");
        map.put(1,"b");
        map.put(3,"c");
        System.out.println("map : "+map);
    }
}
