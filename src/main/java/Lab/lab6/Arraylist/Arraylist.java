package Lab.lab6.Arraylist;

import java.util.Arrays;

public class Arraylist {
    private Object[] elementData = new Object[1];
    private int size = 0;

    //NEW arraaylist static var
    public void add(int x, Object e) {
        if (x > size)
            ensureCapacity(x + 1);//สร้างกล่อง
        else
            ensureCapacity(size + 1);

        for (int j = size - 1; j >= x; j--) {
            elementData[j + 1] = elementData[j];
        }
        elementData[x] = e;
        if (size <= x)
            size = x + 1;
        else
            size++;
    }

    public void ensureCapacity(int x) {
        if (size < x) {
            Object[] temp = new Object[x];
            for (int i = 0; i < size; i++) {
                temp[i] = elementData[i];
            }
            elementData = temp;
        }
    }

    public void remove(int i) {
        for (int j = i; j < size - 1; j++) {
            elementData[j] = elementData[j + 1];
        }
        elementData[size - 1] = null;
        size--;
    }

    public void printfArr() {
        for (int i = 0; i < size; i++) {
            System.out.printf("%d \t", i);
            System.out.println(elementData[i]);
        }
    }

    public void addArr(Object[] e) {
        for (int i = 0; i < e.length; i++) {
            add(e[i]);
        }
    }

    public void add(Object e) {
        ensureCapacity(size + 1);
        elementData[size] = e;
        size++;
    }

    public int size() {
        return size;
    }

    public Object get(int i) {
        return elementData[i];
    }

    public boolean contains(Object e){
        boolean check = false;
        for(int i = 0; i < size ; i++)
        {
            if(e == elementData[i])
            {
                check = true;
            }
        }
        return check;
    }

    public Object getdataPorintI(int x) {
        return elementData[x];
    }


}
