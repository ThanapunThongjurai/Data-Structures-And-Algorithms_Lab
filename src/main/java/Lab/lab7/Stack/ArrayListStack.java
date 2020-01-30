package Lab.lab7.Stack;

import java.util.ArrayList;


public class ArrayListStack {
    public ArrayList lst;

    @Override
    public String toString() {
        return "ArrayListStack{" +
                "lst=" + lst +
                '}';
    }

    public ArrayListStack() {
        lst = new ArrayList();
    }

    public void push(Object e) {
        lst.add(e);
    }

    public Object peek() {
        return lst.get(lst.size() - 1);
    }

    public Object pop() {
        Object obj = peek();
        lst.remove(lst.size() - 1);
        return obj;
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


