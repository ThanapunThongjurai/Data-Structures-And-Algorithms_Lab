package Lab.lab7.Stack;

import java.util.ArrayList;


public class ArrayListQueue {
    private ArrayList lst;

    @Override
    public String toString() {
        return "ArrayListQueue{" +
                "lst=" + lst +
                '}';
    }

    public ArrayListQueue() {
        lst = new ArrayList();
    }

    public Object peek() {
        return lst.get(0);
    }

    public Object dequeue() {
        Object obj = lst.get(0);
        lst.remove(0);
        return obj;
    }

    public void enqueue(Object e) {
        lst.add(e);
    }


    public boolean isEmpty() {
        if (lst.size() == 0) {
            return true;
        } else {
            return false;
        }
    }

    public boolean isFull() {
        if (lst.size() > 0) {
            return true;
        } else {
            return false;
        }
    }
}

