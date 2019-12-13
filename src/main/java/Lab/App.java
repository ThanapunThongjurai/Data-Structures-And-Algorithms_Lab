package Lab;

import Lab.lab4.Count3;
import Lab.lab5.*;

/**
 * Hello world!
 */
public class App {
    public static void main(String[] args) {

        int[] itest = {0, 1, 2, 3, 4, 5, 6};
        int[] itest2 = new int[itest.length];

        //new DoubleArray().copyArray(itest);

        //new GenrerateArray().gen(5);

        //new CountString().count("MARS");

        //new CopyArray().CopyFiveFirst(itest,itest2);

        //new ShiftArray().shiftRight(itest);

        //new SumArray().sumTwo(itest);

        new GenerateArrayI().gen(3,1);
    }
}
