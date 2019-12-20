package Lab.lab4;

import java.util.Scanner;

public class CountDivideBy3 {
    public static void main(String[] args) {
        Scanner dva = new Scanner(System.in);
        int number = dva.nextInt();
        int count = 0;
        for (int i = 1; i <= number; i++) {
            if (i % 3 == 0) {
                System.out.println(i);
                count++;
            }
        }
        System.out.println(count);
    }
}
