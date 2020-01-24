package Lab;

import Lab.lab6.*;
import Lab.lab6.Arraylist.Arraylist;

public class tset {
    public static void main(String[] args) {
        Arraylist A = new Arraylist();
        A.add(0,45);
        A.add(1,7);
        A.add(3,6);
        A.add(5,1);
        A.add(10,45);
        A.add(2,2);
        //A.remove(5);
        A.toString();
        A.printfArr();
    }
}
