package Lab;

import Lab.lab8.PQ.ArrayListPriorityQueue;
import Lab.lab8.PQ.Employee;

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
        ArrayListPriorityQueue max = new ArrayListPriorityQueue();
        Employee a = new Employee("001", "T", "T", 0, 10000);
        max.enqueue(a);

        Employee b = new Employee("002", "T", "T", 0, 20000);
        max.enqueue(b);

        Employee maxObj = (Employee) max.peek();
        System.out.println(maxObj.getSalary());

    }


}
