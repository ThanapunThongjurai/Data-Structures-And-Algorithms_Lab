package Lab.lab8.PQ;

import java.util.ArrayList;

public class ArrayListPriorityQueue {
    ArrayList lst;

    public ArrayListPriorityQueue() {
        lst = new ArrayList();
    }

    private int maxIndex() {
        int max = 0;
        for (int i = 0; i < lst.size(); i++) {
            Comparable d = (Comparable) lst.get(i);
            Object maxObj = lst.get(max);
            if (d.compareTo(maxObj) > 0) {
                max = i;
            }
        }
        return max;

    }

    public Object peek() {
        return lst.get(maxIndex());
    }

    public void enqueue(Object e) {
        lst.add(e);
    }

    public Object dequeue() {
        Object temp = lst.get(maxIndex());
        lst.remove(maxIndex());
        return temp;
    }
}
