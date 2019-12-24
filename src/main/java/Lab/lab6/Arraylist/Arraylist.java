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
