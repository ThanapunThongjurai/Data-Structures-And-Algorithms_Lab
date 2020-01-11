package Lab;

import Lab.lab5.*;
import Lab.lab6.Arraylist.Arraylist;

/**
 * Hello world!
 */
public class App {
    public static void main(String[] args) {

        int[] itest = {0, 1, 2, 3, 4, 5, 6};
        int[] itest2 = new int[itest.length];
        Object[] otest = {0, 1, 2, 3, 4, 5, 6};

        Arraylist test = new Arraylist();
        test.add("+");
        test.add("+");

        test.addArr(otest);
        test.add("+");
        test.add(4, "+");
        test.add(15, "+");
        System.out.println(test.toString());
        test.printfArr();

        CopyArray Tets =  new CopyArray();
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

        /*
        Arraylist arr = new Arraylist();
        arr.add("x");
        arr.add("y");
        arr.add("z");
        System.out.println(arr);
*/
    }


    Arraylist test(int x) {
        Arraylist arr = new Arraylist();
        return arr;
    }
}
