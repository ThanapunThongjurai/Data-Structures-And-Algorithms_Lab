package Lab;

import Lab.lab4.Count3;
import Lab.lab5.*;
import Lab.lab6.Arraylist.Arraylist;

/**
 * Hello world!
 */
public class App {
    public static void main(String[] args) {

        int[] itest = {0, 1, 2, 3, 4, 5, 6};
        int[] itest2 = new int[itest.length];

        /*
        new DoubleArray().copyArray(itest);
        DoubleArray arrr = new DoubleArray();
        arrr.copyArray(itest);
        */
        //new GenrerateArray().gen(5);


        //new CountString().count("MARS");

        //new CopyArray().CopyFiveFirst(itest,itest2);

        //new ShiftArray().shiftRight(itest);

        //new SumArray().sumTwo(itest);

        //new GenerateArrayI().gen(3, 1);

        Arraylist arr = new Arraylist();
        /*
        for (int i = 0; i < 5; i++) {
            arr.add(i,i);
        }

        //arr.remove(0);


        Object[] temp = new Object[itest.length];

        for(int i = 0 ; i < itest.length ; i++)
        {
            temp[i] = itest[i];
            //System.out.println(temp[i]);
        }

        //arr.addArr(temp);
        */

        arr.add(12);
        arr.add(13);
        arr.add(10,7);
        arr.printfArr();
        System.out.println("size getLength "+arr.getLength());
        // + arr.elementData.toString()


    }
}
