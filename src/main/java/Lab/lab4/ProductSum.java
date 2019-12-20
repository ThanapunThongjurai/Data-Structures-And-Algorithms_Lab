package Lab.lab4;

import java.util.Scanner;
import java.util.ArrayList; // import the ArrayList class

public class ProductSum {
    public static void main(String[] args) {
        ArrayList<Integer> box = new ArrayList<Integer>(); // Create an ArrayList object
        Scanner fond = new Scanner(System.in);
        int receive = 0;
        while (receive != -1) {
            receive = fond.nextInt();
            box.add(receive);
        }
        box.remove(box.size() - 1);
        /*
        do
        {
            receive = fond.nextInt();
            box.add(receive);
        }while (receive != -1);
        */
        int answer = 0;
        for (int i : box) {
            answer = answer + i;
        }
        System.out.println(answer);
    }

    void Summy(int n) {

    }
}
