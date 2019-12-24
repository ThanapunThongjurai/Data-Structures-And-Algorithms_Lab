package Lab.lab6.Arraylist;

public class Arraylist {
    private Object[] elementData = new Object[1];
    private int Length = 0;

    public void add(int i, Object e) {
        ensureCapacity(Length + 1);
        for (int j = Length - 1; j >= i; j--) {
            elementData[j + 1] = elementData[j];
        }
        elementData[i] = e;
        Length++;
    }

    private void ensureCapacity(int capacity) {
        if (capacity > elementData.length) {
            int s = 2 * elementData.length;
            Object[] arr = new Object[s];
            for (int i = 0; i < Length; i++) {
                arr[i] = elementData[i];
            }
            elementData = arr;
        }
    }

    //Arr Arraylist
    public void addArr(Object[] e) {
        Cap(e.length);
        for (int i = Length; i < Length+e.length; i++) {
            elementData[i] = e[i-Length];
        }
        Length = Length + e.length;
    }

    private void Cap(int x) {
        Object[] temp = new Object[x+elementData.length];
        for (int i = 0; i < Length; i++) {
            temp[i] = elementData[i];
        }
        elementData = temp;
    }

    //NEW arraaylist static var


    public void remove(int i) {
        for (int j = i; j < Length - 1; j++) {
            elementData[j] = elementData[j + 1];
        }
        elementData[Length - 1] = null;
        Length--;
    }

    public void printfArr() {
        for (int i = 0; i < Length; i++) {
            System.out.println(elementData[i]);
        }
    }

    public int getLength() {
        return Length;
    }

}
