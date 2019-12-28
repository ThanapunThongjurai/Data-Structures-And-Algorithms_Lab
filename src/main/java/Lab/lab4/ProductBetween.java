package Lab.lab4;

import java.util.Scanner;

public class ProductBetween {
    public static void main(String[] args) {
        Scanner KAEW = new Scanner(System.in);
        int a = KAEW.nextInt();
        int b = KAEW.nextInt();
        int answer = 1;
        for (int i = a; i <= b; i++) {
            answer = answer * i;
        }
        System.out.println(answer);
    }
}
