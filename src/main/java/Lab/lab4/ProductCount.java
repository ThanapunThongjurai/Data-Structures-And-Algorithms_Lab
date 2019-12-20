package Lab.lab4;

import java.util.ArrayList;
import java.util.Scanner;

public class ProductCount {
    public static void main(String[] args) {
        Scanner cherpreng = new Scanner(System.in);
        ArrayList<Integer> box = new ArrayList<Integer>(); // Create an ArrayList object
        int receive = 0;
        while (receive != -1) {
            receive = cherpreng.nextInt();
            box.add(receive);
        }
        box.remove(box.size() - 1);
        int count = 0;
        for (int i : box) {
            if (i > 10) {
                count++;
            }
        }
        System.out.println(count);
    }


}
