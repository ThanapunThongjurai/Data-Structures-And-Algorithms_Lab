package Lab;

import Lab.lab6.*;
import Lab.lab6.Arraylist.Arraylist;

public class tset {
    public static void main(String[] args) {
        Arraylist A = new Arraylist();
        A.add(0,6);
        A.add(5,6);
        A.add(3,6);
        A.add(6);
        A.add(9,6);
        A.remove(9);
        A.printfArr();
        A.toString();
    }
}
