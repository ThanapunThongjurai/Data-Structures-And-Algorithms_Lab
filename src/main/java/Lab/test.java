package Lab;

import Lab.lab6.Arraylist.Arraylist;
import Lab.lab7.Stack.ArrayListQueue;
import Lab.lab7.Stack.ArrayListStack;

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

        ArrayListQueue a = new ArrayListQueue();
        a.enqueue(1);
        a.enqueue(2);
        a.enqueue(3);
        System.out.println(a.toString());
        a.dequeue();
        System.out.println(a.toString());
        System.out.println(a.isEmpty());
    }

}
