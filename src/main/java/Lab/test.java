package Lab;

import Lab.lab8.PQ.ArrayListPriorityQueue;
import Lab.lab8.PQ.Employee;
import rmuti.ds.BinaryTree;
import rmuti.ds.Node;
import rmuti.ds.TreeDraw;

import java.util.*;

public class test {
    public static void main(String[] args) {
        /*
        ArrayListStack a = new ArrayListStack();
        a.push(1);
        a.push(2);
        a.push(3);
        a.pop();
        a.pop();
        System.out.println(a.peek());
        System.out.println(a.toString());
        */

        /*
        ArrayListQueue a = new ArrayListQueue();
        a.enqueue(1);
        a.enqueue(2);
        a.enqueue(3);
        System.out.println(a.toString());
        a.dequeue();
        System.out.println(a.toString());
        System.out.println(a.isEmpty());
         */
        /*
        ArrayListPriorityQueue max = new ArrayListPriorityQueue();
        Employee a = new Employee("001", "T", "T", 0, 10000);
        max.enqueue(a);

        Employee b = new Employee("002", "T", "T", 0, 20000);
        max.enqueue(b);

        Employee maxObj = (Employee) max.peek();
        System.out.println(maxObj.getSalary());
        */

        Node c = new Node("c", null, null);
        Node b = new Node("b", null, null);
        Node a = new Node("a", b, c);
        new TreeDraw(a).binaryTreeDraw();

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
