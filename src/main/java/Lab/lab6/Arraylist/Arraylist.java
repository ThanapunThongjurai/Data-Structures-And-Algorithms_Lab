package Lab.lab6.Arraylist;

import java.util.Arrays;

public class Arraylist {
    private Object[] elementData = new Object[1];
    private int size = 0;

    //NEW arraaylist static var


    @Override
    public String toString() {
        return "Arraylist{" +
                "elementData=" + Arrays.toString(elementData) +
                ", size=" + size +
                '}';
    }

    public void add(Object e) {
        ensureCapacity(size + 1);
        elementData[size] = e;
        size++;
    }

    public void add(int x, Object e) {
        ensureCapacity(x + 1 + size);
        for (int j = size - 1; j >= x; j--) {
            elementData[j + 1] = elementData[j];
        }
        elementData[x] = e;
        size = size + 1 + x;
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

    //Arr Arraylist
    public void addArr(Object[] e) {
        //add(0, e[0]); กลับไปทำแบบ add มา
        cap_var_arr(e.length);
        for (int i = size; i < size + e.length; i++) {
            elementData[i] = e[i - size];
        }
        size = size + e.length;
    }

    private void cap_var_arr(int x) {
        Object[] temp = new Object[x + elementData.length];
        for (int i = 0; i < size; i++) {
            temp[i] = elementData[i];
        }
        elementData = temp;
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

    public int getSize() {
        return size;
    }

    public Object getdataPorintI(int x) {
        return elementData[x];
    }


}
